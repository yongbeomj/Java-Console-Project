# Hotel Reservation System

### 1. 주제
- 호텔 예약 시스템
### 2. 개요(주제/목적)
- 호텔 이용을 편리하게 하기 위해 예약서비스를 제공하여 고객들의 만족도를 높임
### 3. 환경
- JDK 11
- Eclipse
- Windows 10
- git
### 4. 서비스 설계 다이어그램
![그림1](https://user-images.githubusercontent.com/87436495/137877871-555af2b4-6989-44b1-afe3-5f5998ae4cc5.png)

![111](https://user-images.githubusercontent.com/87436495/138257543-3a46577b-a9cb-4b86-9b1f-ce959bc6f246.png)

1. Main
ArrayList
예약 메소드
인터페이스 연결
각 클래스 조작
클래스 연결
파일처리

2.1. 예약 (인터페이스)
추상메소드 생성
- 예약등록
- 예약취소
- 본인예약조회
- 전체예약현황
- 파일처리

3. 호텔예약회사 (슈퍼 클래스 - impliments)
추상메소드 생성
- 예약등록
- 예약취소
- 본인예약조회
- 전체예약현황
- 파일처리

3.1. 호텔1 (상속 클래스 - extends)
메소드 등록
- 예약등록
- 예약취소
- 본인예약조회
- 전체예약현황
- 파일처리

3.2. 호텔2 (상속 클래스 - extends)
메소드 등록
- 예약등록
- 예약취소
- 본인예약조회
- 전체예약현황
- 파일처리

3.3. 호텔3 (상속 클래스 - extends)
메소드 등록
- 예약등록
- 예약취소
- 본인예약조회
- 전체예약현황
- 파일처리

2.2 메인메뉴
- 회원가입
- 로그인

회원가입
id입력
pw입력
성명입력
연락처입력

입출력메소드 사용
boolean 사용
get, set 사용

로그인
- 회원메뉴
- 관리자메뉴

### 5. 프로젝트 기간
- 2021.10.19 ~ 2021.10.26 (예정)
### 6. 역할 분담
- 신우현 : Main, 객실 정보 클래스
- 김태호 : 예매 관리 클래스
- 장용범 : 회원정보 관리 클래스
