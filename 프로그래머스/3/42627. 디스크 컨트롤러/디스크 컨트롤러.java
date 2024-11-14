import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // jobs int[요청시간,작업 소요시간]

        // 1. 작업의 소요시간이 짧은 것 [0][1] - [0][0]
        // 2. 작업의 요청시각이 빠른 것
        // 3. 작업의 번호가 작은 것
        PriorityQueue<Job> waiting = new PriorityQueue<>((a, b) -> a.getStartAt() - b.getStartAt());
        PriorityQueue<Job> ready = new PriorityQueue<>();
        
        for(int i=0; i<jobs.length; i++) {
            waiting.add(new Job(i, jobs[i][0], jobs[i][1]));
        }
        
        int currentTime = 0;
        int totalTime = 0;
        
        while(!waiting.isEmpty() || !ready.isEmpty()) {
            while(!waiting.isEmpty() && waiting.peek().getStartAt() <= currentTime) {
                ready.add(waiting.poll());
            }
            
            if(ready.isEmpty()) {
                currentTime = waiting.peek().getStartAt();
                continue;
            }
            
            Job job = ready.poll();
            totalTime += currentTime - job.getStartAt() + job.endAt();  // 대기시간 + 처리시간
            currentTime += job.endAt();  // 현재 시점에서 처리시간만큼 더함
        }
        
        return totalTime / jobs.length;
    }
}

class Job implements Comparable<Job> {
    private int id;
    private int startAt;
    private int endAt;

    public Job(int id, int startAt, int endAt) {
        this.id = id;
        this.startAt = startAt;
        this.endAt = endAt;  // 이것은 작업 소요시간임
    }

    public int getStartAt() {
        return this.startAt;
    }

    public int endAt() {
        return this.endAt;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Job job) {
        if (endAt() > job.endAt()) {  // 작업 소요시간으로 비교
            return 1;
        } else if(endAt() == job.endAt()) {
            if(getStartAt() > job.getStartAt()) {
                return 1;
            } else if(getStartAt() == job.getStartAt()) {
                if(getId() > job.getId()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}