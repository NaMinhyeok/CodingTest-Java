# [Silver II] 섬의 개수 - 4963 

[문제 링크](https://www.acmicpc.net/problem/4963) 

### 성능 요약

메모리: 16072 KB, 시간: 140 ms

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 제출 일자

2024년 8월 12일 11:07:55

### 문제 설명

<p>You are given a marine area map that is a mesh of squares, each representing either a land or sea area. Figure B-1 is an example of a map.</p>

<p><img alt="" src="https://www.acmicpc.net/upload/images/island.png" style="height:141px; width:283px"></p>

<p>Figure B-1: A marine area map</p>

<p>You can walk from a square land area to another if they are horizontally, vertically, or diagonally adjacent to each other on the map. Two areas are on the same island if and only if you can walk from one to the other possibly through other land areas. The marine area on the map is surrounded by the sea and therefore you cannot go outside of the area on foot.</p>

<p>You are requested to write a program that reads the map and counts the number of islands on it. For instance, the map in Figure B-1 includes three islands.</p>

### 입력 

 <p>The input consists of a series of datasets, each being in the following format.</p>

<p>w h<br>
c1,1 c1,2 ... c1,w<br>
c2,1 c2,2 ... c2,w<br>
...<br>
ch,1 ch,2 ... ch,w</p>

<p>w and h are positive integers no more than 50 that represent the width and the height of the given map, respectively. In other words, the map consists of w×h squares of the same size. w and h are separated by a single space.</p>

<p>ci, j is either 0 or 1 and delimited by a single space. If ci, j = 0, the square that is the i-th from the left and j-th from the top on the map represents a sea area. Otherwise, that is, if ci, j = 1, it represents a land area.</p>

<p>The end of the input is indicated by a line containing two zeros separated by a single space</p>

### 출력 

 <p>For each dataset, output the number of the islands in a line. No extra characters should occur in the output.</p>

