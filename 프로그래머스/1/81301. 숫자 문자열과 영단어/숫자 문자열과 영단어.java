class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                sb.append(s.substring(i,i+1));
            }
            switch(c){
                    case 'z' -> {
                        sb.append(0);
                        i += 3;
                    }
                    case 'o' -> {
                        sb.append(1);
                        i += 2;
                    }
                    case 't' -> {
                        if(s.charAt(i+1)=='w'){
                            sb.append(2);
                            i += 2;
                        } else if(s.charAt(i+1)=='h'){
                            sb.append(3);
                            i += 4;
                        }
                    }
                    case 'f' -> {
                        if(s.charAt(i+1)=='o'){
                            sb.append(4);
                            i += 3;
                        } else if(s.charAt(i+1)=='i'){
                            sb.append(5);
                            i += 3;
                        }
                    }
                    case 's' -> {
                        if(s.charAt(i+1)=='i'){
                            sb.append(6);
                            i += 2;
                        } else if(s.charAt(i+1)=='e'){
                            sb.append(7);
                            i += 4;
                        }
                    }
                    case 'e' -> {
                        sb.append(8);
                        i += 4;
                    }
                    case 'n' -> {
                        sb.append(9);
                        i += 3;
                    }
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }
}