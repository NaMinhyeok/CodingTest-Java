# [Silver I] 점프 - 1890 

[문제 링크](https://www.acmicpc.net/problem/1890) 

### 성능 요약

메모리: 14300 KB, 시간: 132 ms

### 분류

다이나믹 프로그래밍

### 제출 일자

2024년 4월 5일 22:48:04

### 문제 설명

<p>An n × n game board is populated with integers, one nonnegative integer per square. The goal is to jump along any legitimate path from the upper left corner to the lower right corner of the board. The integer in any one square dictates how large a step away from that location must be. If the step size would advance travel off the game board, then a step in that particular direction is forbidden. All steps must be either to the right or toward the bottom. Note that a 0 is a dead end which prevents any further progress.</p>

<p>Consider the 4 × 4 board shown in Figure 1, where the solid circle identifies the start position and the dashed circle identifies the target. Figure 2 shows the three legitimate paths from the start to the target, with the irrelevant numbers in each removed.</p>

<p><img alt="" src="https://www.acmicpc.net/upload/images/jump(3).png" style="height:140px; width:492px"></p>

<p>Your task is to write a program that determines the number of legitimate paths from the upper left corner to the lower right corner.</p>

### 입력 

 <p>The input contains a first line with a single positive integer n, 4 ≤ n ≤ 100, which is the number of rows in this board. This is followed by n rows of data. Each row contains n integers, each one from the range 0…9.</p>

### 출력 

 <p>The output should consist of a single line containing a single integer, which is the number of legitimate paths from the upper left corner to the lower right corner.</p>

