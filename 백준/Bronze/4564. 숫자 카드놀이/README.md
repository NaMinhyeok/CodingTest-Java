# [Bronze II] 숫자 카드놀이 - 4564 

[문제 링크](https://www.acmicpc.net/problem/4564) 

### 성능 요약

메모리: 20872 KB, 시간: 108 ms

### 분류

구현, 수학

### 제출 일자

2025년 1월 11일 18:47:05

### 문제 설명

<p>Despite the glorious fall colors in the midwest, there is a great deal of time to spend while on a train from St. Louis to Chicago. On a recent trip, we passed some time with the following game.</p>

<p>We start with a positive integer S. So long as it has more than one digit, we compute the product of its digits and repeat. For example, if starting with 95, we compute 9 × 5 = 45. Since 45 has more than one digit, we compute 4 × 5 = 20. Continuing with 20, we compute 2 × 0 = 0. Having reached 0, which is a single-digit number, the game is over.</p>

<p>As a second example, if we begin with 396, we get the following computations: </p>

<p>3 × 9 × 6 = 162 <br>
1 × 6 × 2 = 12 <br>
1 × 2 = 2 </p>

<p>and we stop the game having reached 2.</p>

### 입력 

 <p>Each line contains a single integer 1 ≤ S ≤ 100000, designating the starting value. The value S will not have any leading zeros. A value of 0 designates the end of the input.</p>

### 출력 

 <p>For each nonzero input value, a single line of output should express the ordered sequence of values that are considered during the game, starting with the original value.</p>

