# [Bronze I] 나무 조각 - 2947 

[문제 링크](https://www.acmicpc.net/problem/2947) 

### 성능 요약

메모리: 23684 KB, 시간: 140 ms

### 분류

구현, 시뮬레이션

### 제출 일자

2025년 1월 4일 10:25:34

### 문제 설명

<p>Goran has five wooden pieces arranged in a sequence. There is a number between 1 and 5 inscribed on every piece, so that every number appears on exactly one of the five pieces. </p>

<p>Goran wants to order the pieces to form the sequence 1, 2, 3, 4, 5 and does it like this: </p>

<ol>
	<li>If the number on the first piece is greater than the number on the second piece, swap them. </li>
	<li>If the number on the second piece is greater than the number on the third piece, swap them. </li>
	<li>If the number on the third piece is greater than the number on the fourth piece, swap them. </li>
	<li>If the number on the fourth piece is greater than the number on the fifth piece, swap them. </li>
	<li>If the pieces don't form the sequence 1, 2, 3, 4, 5, go to step 1. </li>
</ol>

<p>Write a program that, given the initial ordering of the pieces, outputs the ordering after each swap. </p>

### 입력 

 <p>The first line contains five integers separated by single spaces, the ordering of the pieces. </p>

<p>The numbers will be between 1 and 5 (inclusive) and there will be no duplicates. </p>

<p>The initial ordering will not be 1, 2, 3, 4, 5. </p>

### 출력 

 <p>After any two pieces are swapped, output the ordering of the pieces, on a single line separated by spaces. </p>

