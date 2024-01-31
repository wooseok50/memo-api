# 메모장 프로젝트 설계

## 메모장 기능 

    1. 접속 하자마자 메모 전체 목록 조회하기
        1. GET API 사용해서 메모 목록 불러오기
        
    2. 메모 생성하기
        1. POST API 사용해서 메모 신규 생성하기
        2. 생성된 메모 반환
        
    3. 메모 변경하기
        1. PUT API 사용해서 메모 내용 변경하기
        2. 사용자가 클릭한 메모가 DB에 존재하는지 확인하기
        3. 해당 메모 내용 변경
        
    4. 메모 삭제하기
        1. DELETE API 사용해서 메모 삭제하기
        2. 사용자가 삭제하려는 메모가 DB에 존재하는지 확인하기
        3. DB에서 해당 메모 삭제

## API
![image](https://github.com/wooseok50/memo-api/assets/155416976/bf43e59b-9703-4893-9478-c45be765962c)

## ERD
![image](https://github.com/wooseok50/memo-api/assets/155416976/357c591e-7c66-468e-bb80-5265f12e980e)

