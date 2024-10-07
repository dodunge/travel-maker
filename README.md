# TravelMaker
<h1>국내 관광지 인식 개선 및 지역 경제 활성화 서비스</h1>


<h2>1. 기획 배경</h2>
<img src="https://github.com/dodunge/travel-maker/blob/master/images/travelmaker%EA%B8%B0%ED%9A%8D%EB%B0%B0%EA%B2%BD.png"  style = "width: 80%; height : 480"/>
국내 관광지에 대한 부정적인 시선이 늘어나고 있다. 문제는 <strong>컨텐츠 부족 & 바가지 요금</strong>이다. <br>
이유는 지방의 다양한 관광지에 대한 정보가 부족하고, 피드백을 주고받기 매우 어렵다는 것이다. <br>
따라서 지방 관광지를 활성화 시키고 개선사항 및 여행 스토리를 나누므로써 <strong>지역 경제 활성화 & 여행지의 인식개선</strong>을 도모할 수 있는 플랙폼이 필요하다.

</div>

<br>
<br>
<h2>2. 해결 방안 및 서비스 소개</h2>
<img src="https://github.com/dodunge/travel-maker/blob/master/images/travelmaker%ED%95%B4%EA%B2%B0%EB%B0%A9%EC%95%88.png" style = "width: 80%; height : 480">
<img src="https://github.com/dodunge/travel-maker/blob/master/images/travelmaker%EC%84%9C%EB%B9%84%EC%8A%A4%EC%86%8C%EA%B0%9C.png" style = "width: 80%; height : 480">
<h4>테마별 색다른 관광루트 및 명소 제공 기능</h4>
<h4>손쉬운 개선사항 요청이 가능한 커뮤니티 기능</h2>
<h4>즉각적인 피드백을 주고 받을 수 있는 스토리 기능</h2>
<h4>관광지 환경보존에 대한 선순환 구조를 유도하는 에코인증 기능</h4>


<br>
<h2>3. 프로젝트 사용 툴</h2>
<img src="https://github.com/dodunge/travel-maker/blob/master/images/travelmaker%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD.png"style = "width: 80%; height : 480">
        - Java<br>
        - Java Script<br>
        - tomcat<br>
        - jQuery<br>
        - JPA<br>
        - Spring Data JPA<br>
        - JPA QueryDSL<br>
        - Spring Boot<br>
        - Oracle<br>
        - IntelliJ<br>
        - DBeaver<br>
        - git, github<br>
        - Ajax<br>
        - JDK 11.0.15<br>
        - Naver DEVELOPER API<br>
        - Kakao DEVELOPER API<br>
        - Google DEVELOPER API<br>
        - postman<br>
        - gradle<br>

<br>
<h2>4. ERD</h2>
<img src="https://github.com/dodunge/travel-maker/blob/master/images/erd.png">

<h2>5. 담당 업무</h2>
5-1 퍼블리싱 & 프론트엔드<br>
▶ 스토리 / 고객센터 / 로그인 / 회원가입

- 스토리 목록 / 등록 / 수정 / 상세
- 고객센터 메인
- 업체회원 자주 묻는 질문 목록 / 상세
- 일반회원 자주 묻는 질문 목록 / 상세
- 문의·신고 등록
- 공지 목록 / 상세
- 로그인 (계정 선택)
- 비밀번호 입력
- 비밀번호 재설정 / 재설정 완료
- 회원가입
- 계정 찾기 / 찾기 성공 / 찾기 실패
- 업체 목록 / 등록 / 수정 / 상세


<br>
5-2 백엔드<br>
▶ 마이페이지 : 전체    - postman<br>
        - gradle<br>

<br>
<h2>4. ERD</h2>
<img src="https://github.com/dodunge/travel-maker/blob/master/images/erd.png">

<h2>5. 담당 업무</h2>
5-1 퍼블리싱 & 프론트엔드<br>
▶ 스토리 / 고객센터 / 로그인 / 회원가입

- 스토리 목록 / 등록 / 수정 / 상세
- 고객센터 메인
- 업체회원 자주 묻는 질문 목록 / 상세
- 일반회원 자주 묻는 질문 목록 / 상세
- 문의·신고 등록
- 공지 목록 / 상세
- 로그인 (계정 선택)
- 비밀번호 입력
- 비밀번호 재설정 / 재설정 완료
- 회원가입
- 계정 찾기 / 찾기 성공 / 찾기 실패


<br>
5-2 백엔드<br>
▶ 마이페이지 : 전체
- 아이디, 이메일 중복 검사 및 핸드폰 인증 API를 사용
- 필수 정보 입력 여부 검사
- 조건 충족 시 회원가입
- 카카오 API를 이용한 간편 회원가입
- 네이버 API를 이용한 간편 회원가입
- 구글 API를 이용한 간편 회원가입



▶ 업체
- 업체 여러장 사진 등록 기능
- 업체 여러장 사진 수정 기능
- 업체 목록 기능
- 업체 개별 / 동시 삭제 기능



▶ SHOP(지역 화페)
- 지역 화페 구매 기능 구현

  
 
 
<h1>아래 내용들은 프로젝트 끝나면 수정 예정</h1>
<h2>6. 느낀점</h2>
<h3>6-1. 어려웠던 부분</h3>
ERD를 만들 때, 정규화와 반정규화를 고려하고 어떤 테이블과 컬럼으로 구성해야하는지 그리고 PK, FK 관계도 어려웠으며 , 특히 슈퍼키 서브키를 통한 정규화 테이블들도 ERD 제작하는 데 어려움을 느꼈습니다. <br>
JSP 프로젝트 때도 느꼈지만, 팀원들과 협업하는 프로젝트이기 때문에 GIT, GITHUB를 사용하면서 소통이 중요하고 어려웠다는 것을 느꼈습니다.<br>
댓글과 대댓글을 한테이블에서 제작하여 구성하는 것이 어려웠습니다.<br>
<br>


<h3>6-2. 문제를 해결했던 부분</h3>
<h4>📌Oauth 카카오, 네이버 로그인 API 사용</h4><br>
🌩문제 상황🌩<br>
카카오, 네이버 로그인을 통하여 가입한 회원 프로필 설정<br><br>
🚨문제 원인🚨 <br>
처음에는 MEMBER TABLE에 파일 컬럼에 추가해야하는 줄 알았는데, 네이버나 카카오는 프로필을 링크로 주기 때문에 어떻게 DB에 INSERT하여 사용할지 방향성을 잡지 못함 <br><br>
🚀해결 방법🚀<br>
MEMBER TABLE에 SNS_PROFILE을 NULL로 컬럼을 추가하여 ERD 구성이 바뀌었지만, 그 컬럼에 링크를 받아서 검사하여 화면에서 프로필 사진을 보여지게 하였음
<br><br><br>



<h4>📌Mapper 매개변수</h4> <br>
🌩문제 상황🌩<br>
 Mapper.xml과 Mapping 되는 Mapper Interface를 설정할 때 매개변수로 객체로 2개 받을 경우 param1, param2 라는 오류가 발생함<br><br>
🚨문제 원인🚨 <br>
Mapper Interface 매개변수 객체 2개 앞에 @Param("이름")과 Mapper.xml 파일에서 #{이름.필드명}을 작성하지 않아서 발생하였음 <br><br>
🚀해결 방법🚀<br>
Mapper Interface 매개변수 객체 2개 앞에 @Param("이름")을 각각 붙혀주고 Mapper.xml 파일에서 #{이름.필드명} 으로 접근해서 사용해서 해결 했음 
<br><br><br>



<h4>📌게시판 / 댓글 / 대댓글</h4> <br>
🌩문제 상황🌩<br>
삭제 기능을 구현해서 사용한 결과 FK 오류가 발생함
<br><br>
🚨문제 원인🚨 <br>
FK 관계 때문에 삭제에도 순서가 있는데 기능 구현 할때 순서를 고려하지 않아서 발생하였음
 <br><br>
🚀해결 방법🚀<br>
ServiceImp에서 fk를 고려하여 순서에 맞게 삭제 DAO를 사용하여 오류를 해결함
<br><br>


<h3>6-3. 총평</h3>
<h4>🌟 기획: 기반이 중요하다. </h4>
프로젝트를 진행하는 기간인 약 4주안에 서비스를 구현하는 것이 정말 어려웠지만, 그 중에 제일 중요한 것은 기획이라고 많이 느꼈습니다. 기획이 탄탄해야 나중에 가서 중간에 화면이나 SQL문을 수정하는 상황과 불필요한 테이블이 생기는 상황을 막을 수 있다는 것을 느꼈고, 그 프로젝트 웹개발 완성도의 퀄리티가 기획에 따라 엄청난 차이가 난다는 것을 느꼈습니다.


<h4>🌟 협업: 기록과 소통과 회의는 필수이다. </h4>
협업은 서로 소통이 무조건 우선이라고 느꼈습니다. 그 이유는 소통을 못하면 아무리 구현을 잘해도 GIT, GITHUB 소통에 과정에서 열심히 짠 코드가 사라질 수 도 있는 것이며, 충돌 그리고 의사소통에 문제로 구현되어야하는 서비스가 구현이 안 되어있고, 제작 의도와 다른 서비스로 구현 될 수 있음을 느꼈다. 그래서 소통을 자주 함으로써 이러한 문제 발생을 막을 수 있다고 생각이 들었습니다. 그리고 회의를 통해 서로 어떤 문제점이 있는 지 공유하여 해결하고 앞으로 방향성도 정할 수 있었습니다. 그에 대한 기록을 통하여 자신이 까먹을 수 있는 부분을 자료로 확인하여 실수를 최소화하여 결과적으로 협업에서 기록, 소통, 회의를 함으로써 완성된 작업물에 퀄리티가 엄청나게 상승할 수 있다는 것을 알게 되었습니다.


<h4>🌟 공부: 공부할수록 나의 가치는 올라간다. </h4>

개발을 접하면서부터 느낀점은 정말 개발이라는 분야에서 공부는 끝이 없고, 개발 트랜드는 계속 변해가고 그 변화에 따라가야 나의 발전도 멈추지 않고 올라간다고 느꼈습니다. 그래서 만약 취업에 성공한다하더라도 나머지 개인시간에는 공부를 위한 재투자를 무조건 해야한다고 느꼈습니다. 그리고 점점 새로운 기술을 알아갈수록 그에 대한 보상이 성취감과 만족감으로 나에게 다가왔기 때문에 더욱 더 발전해야겠다는 생각이 하루가 지날때 마다 깨닫게 되었습니다.





