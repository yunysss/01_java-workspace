# Java 수업

## 1. 변수 (Variable)
### 1_1. 변수란?
메모리상에 데이터를 기록하기 위한 공간
### 1_2. 변수를 사용하는 이유
- 값에 의미를 부여 (가독성이 좋아짐)
- 한 번 값을 저장해두고 계속 사용할 목적으로 사용
- 유지보수에 용이
### 1_3. 변수의 특징
- 한 개의 값만 담을 수 있음
- 자료형에 맞는 값만 담을 수 있음
- 새로운 값을 다시 대입할 수 있음
### 1_4. 변수의 선언 / 초기화
```
자료형 변수명;
변수명 = 값;
=> 자료형 변수명 = 값;
```
### 1_5. 자료형의 종류
- 기본형 (8개)
  - 논리형 (논리값 = true / false)
    - boolean (1byte) 
  - 숫자형
    - 정수형
      - byte : 1byte (-128 ~ 127)
      - short : 2byte
      - int : 4byte (기본형)
      - long : 8byte
    - 실수형
      - float : 4byte
      - double : 8byte (기본형)
  - 문자형
    - char : 2byte
- 참조자료형
  - String ...
### 1_6. 변수 명명 규칙
- 변수명 중복 불가 (대소문자는 구분)
- 변수명으로 예약어 사용 불가
  
  ![캡처](https://user-images.githubusercontent.com/115604544/201270150-8a0ae664-4ab5-44ba-bb7a-6c801af74024.JPG)
- 숫자 포함 가능 (숫자로 시작 불가)
- 특수문자(_, $) 가능
- 낙타표기법 준수
- 한글 가능
### 1_7. 상수
- 값 변경 불가
- 상수명 전체 대문자로 작성
```
final 자료형 상수이름;
```
### 1_8. 화면에서 입력받기 (Scanner)
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```
- 문자열
  - next() : 공백 이전까지의 값만 읽어들임
  - nextLine() : 공백 포함 사용자가 입력한 한 줄 다 읽어들임
- 정수 : nextInt()
- 실수 : nextDouble()
- 문자값 : 문자열.charAt(뽑고자 하는 인덱스)
  - 문자열의 부적절한 인덱스 접근시 StringIndexOutOfBoundsException 발생
- sc.nextLine() : nextLine()메소드 외의 메소드로 값을 가져온 후 버퍼에 남아있는 '엔터'를 비워주는 역할 
### 1_9. 출력문 (print)
- System.out.print(출력하고자 하는 값); : 값 출력 (줄바꿈 없음)
- System.out.println(출력하고자 하는 값); : 값 출력 후 줄바꿈
- System.out.printf("출력하고자 하는 형식 (포맷)", 출력하고자 하는 값, 값, 값, ...); : 제시한 형식에 맞춰 출력하고자 하는 값 출력 (줄바꿈 없음)
  - 키워드
    - %d : 정수 자리
    - %c : 문자 자리 / %C : 대문자
    - %s : 문자열 자리 (문자 가능) / %S : 대문자
    - %f : 실수 자리 (소수점 아래 6자리)
    - %b : 논리형 자리
    - % 입력하기 : %%
  - 출력하고자 하는 값의 갯수가 더 많으면 첫번째 값만 출력   
    출력 형식(포맷)의 자리가 더 많으면 에러 발생
  - 정렬방법
    - %5d : 5칸 확보하고 오른쪽 정렬
    - %-5d : 5칸 확보하고 왼쪽 정렬
    - %.2f : 소수점 아래 2자리까지만 표시
  - Escape 문자
    - \t (tab) : 정해진 공간만큼 띄어쓰기
    - \n (new line) : 출력하고 다음 라인으로 옮김
    - \u (유니코드)
    - 특수문자 사용시 백슬래시 (\)를 넣고 특수문자 넣어야 함
### 1_10. 형변환
- 형변환이란?
값의 자료형을 바꾸는 것 (boolean 제외)
- 자동 형변환

자료형이 다른 두 값의 연산 시 자동의로 값의 범위가 작은 자료형이 큰 자료형으로 변환되어 처리

![캡처2](https://user-images.githubusercontent.com/115604544/201277250-11395850-0b90-440d-a6dc-547dd6706c4a.JPG)
- 강제 형변환

큰 크기의 자료형을 작은 크기의 자료형으로 강제로 바꾸는 것
  - 데이터 손실 발생 가능
***
## 2. 연산자 (Operator)

![캡처3](https://user-images.githubusercontent.com/115604544/201277860-03af78a6-aff1-4f83-a14d-2390f3fac595.JPG)
### 2_1. 단항 연산자
- ! 논리부정 연산자
  - 논리값 (true / false)을 반대로 바꾸는 연산자
  - 논리값을 가지고 연산하고 그 결과도 논리값
- 증감 연산자
  - ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
  - -- : 변수에 담긴 값을 1 감소시켜주는 연산자
  - 전위 / 후위연산
    - 전위연산 : (증감연산자)변수 => "선증감"후처리
    - 후위연산 : 변수(증감연산자) => 선처리"후증감"
### 2_2. 이항 연산자
- 산술 연산자
  - / % * > + -  
- 비교 연산자 / 관계 연산자
  - 대소비교 연산자 : < > <= >=
  - 동등비교 연산자 : == !=
  - 문자와 숫자간 대소 비교 가능 
- 논리 연산자
  - 논리값 && 논리값
    - 왼쪽, 오른쪽 둘 다 true일 경우 결과값 true
    - 둘 중 하나라도 false일 경우 결과값 false
    - ~이고, 그리고, ~이면서, ~뿐만아니라
    - && 연산자를 기준으로 앞의 결과가 false일 경우 뒤쪽 조건검사는 굳이 실행되지 않음
  - 논리값 || 논리값
    - 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 결과값 true
    - 두 개의 조건 모두 false일 경우 결과값 false
    - ~이거나, 또는
    - || 연산자를 기준으로 앞의 결과가 true일 경우 뒤쪽 조건검사는 굳이 실행되지 않음
    
      ![캡처4](https://user-images.githubusercontent.com/115604544/201280294-9e7ff111-f240-4d11-aa9e-2dbedadd636b.JPG)
### 2_3. 삼항 연산자
```
조건식?조건식이 true일 경우 돌려줄 결과값:조건식이 false일 경우 돌려줄 결과값
```
- 조건식 : 반드시 true / false가 나오도록 작성
- 비교 / 논리 연산자를 이용해 작성
- 삼항 연산자 중첩 사용 가능
```java
num > 0 ? "양수이다." : (num < 0 ? "음수이다." : "0이다.");
```
### 2_4. 복합 대입 연산자
```
a = a + 3;  => a += 3;
a = a - 3;  => a -= 3;
a = a * 3;  => a *= 3;
a = a / 3;  => a /= 3;
a = a % 3;  => a %= 3;
```
- 특이케이스
  - 문자열 연이어 줄 때는 +=만 사용 가능
  - 문자열과 숫자도 연이어 줄 수 있음
***
## 3. 제어문 (Control)
### 3_1. 조건문 (If / Switch)
- If문
  - 단독 if문
  ```
  if(조건식){   
    실행시키고자 하는 코드   
    ...   
  }
  ```
    - 조건식이 true일 경우 중괄호 블럭 안의 코드 실행
    - 조건식이 flase일 경우 중괄호 블럭 무시하고 넘어감
  - if-else문
  ```
  if(조건식){   
    실행코드1;   
  } else{   
    실행코드2;   
  }
  ```
    - 조건식이 true일 경우 실행코드1 수행 후 if-else문 빠져나감
    - 조건식이 false일 경우 무조건 실행코드2 수행
  - if-else if문
  ```
  if(조건식1){   
    실행코드1;   
  } else if(조건식2){   
    실행코드2;   
  } else{   
    위의 조건들이 다 false일 경우 실행할 코드   
  }
  ```
    - else문 생략 가능
    - return; 해당 메소드를 호출했던 곳으로 빠져나가는 구문
    - 조건문 중첩 사용 가능
- switch문
  ```
  switch(동등 비교할 대상자){   
  case 값1: 실행코드1; break;   
  case 값2: 실행코드2; break;   
  ...   
  default: 위의 값들과 모두 일치하지 않을 경우 실행코드;   
  }
  ```
    => default 생략 가능
  - if문과의 차이점
    - if문 안의 조건식은 자유롭게 기술 가능 (범위에 대한 조건, 동등 비교 등)
    - switch문은 동등비교만 가능
    - 실행할 구문만 실행하고 자동으로 빠져나오지 못함 (직접 break문 작성)
  - break없는 switch문

    등급별 권한   
    1 : 읽기권한, 글쓰기권한, 관리권한   
    2 : 읽기권한, 글쓰기권한   
    3 : 읽기권한
    ```java
    Scanner sc = new Scanner(System.in);
    System.out.print("등급(정수) : ");
    int level = sc.nextInt();

    switch(level) {
    case 1 : System.out.println("관리권한");
    case 2 : System.out.println("글쓰기권한");
    case 3 : System.out.println("읽기권한");
    }
    ```
### 3_2. 반복문 (For / While (Do While))
- for문
  ```
  for(초기식;조건식;증감문){   
    반복적으로 실행시키고자 하는 코드;   
  }
  ```
  - 초기식 : 반복문이 수행될 때 처음에 단 한번만 실행되는 구문   
              (반복문 안에서 사용될 변수를 선언과 동시에 초기화)
  - 조건식 : 반복문이 수행될 조건을 작성하는 구문   
              조건식이 true일 경우 해당 구문 실행   
              조건식이 false일 경우 반복을 멈추고 빠져나감   
              (초기식에 제시된 변수를 가지고 조건식 작성)
  - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
              (초기식에 제시된 변수를 가지고 증감연산자 (++, --)와 함께 작성)
  - 무한반복
      - 조건식 == true
      - for(;;){}
  - 원하는 횟수만큼 반복문 돌리고자 할 때
    ```
    for(int i=0; i<횟수; i++){}
    ```
  - 중첩 for문
    - 바깥쪽 for문 : 행 조건
    - 안쪽 for문 : 열 조건
- while문
  ```
  초기식;   
  while(조건식){   
    반복적으로 실행할 코드;   
    증감식;   
  }
  ```
    => 초기식, 증감식 생략 가능
- do-while문
  ```
  do{   
    반복적으로 실행할 코드;   
  } while(조건식);
  ```
  - 처음에 조건검사 없이 무조건 한번 실행   
    => 조건검사 => true일 경우 실행   
    ------------반복------------   
    => 조건검사 => false일 경우 실행하지 않고 반복문 종료
### 3_3. 분기문 (Break / Continue)
- break문
  ```
  break;
  ```
  - 반복문 안에 사용되는 분기문
  - break; 실행 시 현재 속해있는 반복문을 빠져나감
  - 유의사항
    - switch문 안에서의 break;은 오로지 switch문만 빠져나감
- continue문
  ```
  continue;
  ```
  - 반복문 안에 사용되는 분기문
  - continue; 실행 시 그 뒤의 구문들 실행되지 않고 곧바로 현재 속해있는 반복문 위로 올라감
***
## 4. 배열 (Array)
### 4_1. 변수와 배열 비교
- 변수 : 하나의 공간에 하나의 값을 담을 수 있음
- 배열 : 하나의 공간에 여러 개의 값을 담을 수 있음   
        단, 같은 자료형의 값으로만 담을 수 있음
### 4_2. 배열의 선언 / 할당 / 초기화
```
자료형 배열명[];
자료형[] 배열명;
배열명 = new 자료형[배열크기];
=> 자료형[] 배열명 = new 자료형[배열크기];
배열명[인덱스] = 값;
=> 자료형[] 배열명 = new 자료형[]{값, 값, ...}   
   자료형[] 배열명 = {값, 값, ...}
```
### 4_3. 배열 저장구조

![캡처5](https://user-images.githubusercontent.com/115604544/201294760-07bcd0a7-c94c-4ccf-8722-1c78fe92aee3.JPG)
- 기본자료형으로 선언된 변수 : 실제 리터럴값을 바로 담는 변수 => 일반 변수
- 그 외 자료형으로 선언된 변수 : 주소값을 담는 변수 => 참조 변수 (레퍼런스 변수)
- Heap에는 빈 공간이 존재할 수 없음 => JVM이 기본값을 초기화 해줌 => 각 인덱스에 직접 값 대입하지 않아도 초기화 되어있음
### 4_4. 배열의 단점
- 한번 지정된 배열의 크기는 변경 불가 => 새로운 크기의 배열 다시 만들어야 함
- 연결이 끊긴 기존 배열은 그 어디에도 참조되고 있지 않은 불필요한 존재가 되어 일정 시간 지나면 가비지컬렉터(GC)가 지워줌 => 자동메모리 관리
- 배열을 강제로 삭제시키고자할 경우 => 연결고리 끊기
  ```java
  arr = null;
  ```
### 4_4. 배열 복사
- 얕은 복사
  
  ![Untitled](https://user-images.githubusercontent.com/115604544/201296108-36392e21-811c-4a56-a307-1409579302cb.png)
  ```java
  int[] origin = {1, 2, 3, 4, 5};
  int[] copy = origin;
  
  copy[2] = 99;
  System.out.println(Arrays.toString(origin)); // [1, 2, 99, 4, 5]
  System.out.println(Arrays.toString(copy)); // [1, 2, 99, 4, 5]
  System.out.println(origin == copy); // true
  ```
  - 주소값만을 복사
  - 같은 곳을 참조
- 깊은 복사
  
  ![Untitled](https://user-images.githubusercontent.com/115604544/201296705-38aee473-e329-47db-9b6f-cb32b68697ec.png)
  - for문 활용
    새로운 배열 생성 후 반복문 활용하여 원본배열의 각 인덱스 값을 새로운 배열에 대입
    ```java
    int[] origin = {1, 2, 3, 4, 5};
    int[] copy = new int[5];

    for(int i=0; i<origin.length; i++) {
      copy[i] = origin[i];
    }

    copy[2] = 99;
    System.out.println(Arrays.toString(origin)); // [1, 2, 3, 4, 5]
    System.out.println(Arrays.toString(copy)); // [1, 2, 99, 4, 5]
    System.out.println(origin == copy); // false
    ```
  - System클래스의 arraycopy메소드 활용
    ```
    System.arraycopy(원본배열명, 복사시작할인덱스, 복사본배열명, 복사본배열의복사될시작인덱스, 복사할갯수);
    ```
    ```java
    int[] origin = {1, 2, 3, 4, 5};
    int[] copy = new int[10];

    System.arraycopy(origin, 2, copy, 5, 3)

    System.out.println(Arrays.toString(copy)); // [0, 0, 0, 0, 0, 3, 4, 5, 0, 0] 
    System.out.println(origin == copy); // false
    ```
  - Arrays클래스의 copyOf메소드 활용
    ```
    복사본배열 = Arrays.copyOf(원본배열명, 복사할길이);
    ```
    내가 제시한 길이만큼의 새로운 배열생성   
    => 내가 제시한 길이가 원본 배열보다 클 경우 기존의 배열에 담겨 있는 값 복사 후 나머지 자리는 0   
    => 내가 제시한 길이가 원본 배열보다 작을 경우 기존의 배열에 담겨 있는 값 제시한 길이만큼만 복사
    ```java
    int[] origin = {1, 2, 3, 4, 5};
    int[] copy = Arrays.copyOf(origin, 10);

    System.out.println(Arrays.toString(copy)); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
    System.out.println(origin == copy); // false
    ```
  - clone()메소드 활용
    ```
    복사본배열 = 원본배열.clone();
    ```
    ```java
    int[] origin = {1, 2, 3, 4, 5};
    int[] copy = origin.clone();

    System.out.println(Arrays.toString(copy)); // [1, 2, 3, 4, 5]
    System.out.println(origin == copy); // false
    ```
      
