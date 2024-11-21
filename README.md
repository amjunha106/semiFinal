<h1>Human Train Project</h1>
<img src="/images/image1.png" alt="Image">
<br>
<h1>소개 및 개요</h1>
프로젝트 기간 : 2024-06-19 ~ 2024-07-12<br>
인원 : 3인<br>
주제 : 열차예약/조회 사이트 만들기<br>
사용언어 : JAVA, JAVASCRIPT
<br>

<details>
  <summary>프로젝트 구조</summary>

  <pre>
  C:.
  ├─build
  │  └─classes
  │      ├─htproject
  │      │  ├─mvc
  │      │  │  ├─Controller
  │      │  │  ├─Dao
  │      │  │  └─Service
  │      │  └─z01_vo
  │      └─resource
  └─src
      ├─build
      │  └─classes
      │      ├─htproject
      │      │  ├─mvc
      │      │  │  ├─Controller
      │      │  │  ├─Dao
      │      │  │  └─Service
      │      │  └─z01_vo
      │      └─resource
      └─main
          ├─java
          │  ├─htproject
          │  │  ├─mvc
          │  │  │  ├─Controller
          │  │  │  ├─Dao
          │  │  │  └─Service
          │  │  └─z01_vo
          └─resource
          └─webapp
              ├─a00_com
              ├─META-INF
              ├─semi-final
              │  ├─노선도
              │  ├─메인슬라이드
              │  └─추천여행지
              │      ├─강릉
              │      ├─순천
              │      └─진주
              ├─MainHome.jsp
              ├─Recomend.jsp
              ├─RouteMap.jsp
              └─styles.css
          └─WEB-INF
             ├─lib
             └─views
                 └─mvc
                    ├─a01_MyPage.jsp
                    ├─02_memberInsertForm.jsp
                    ├─a03_MemDetail.jsp
                    ├─a04_tview.jsp
                    └─a05_t_list.jsp
  </pre>
</details>

<br>
<h1>팀원소개 및 역학분담</h1>
<img src="/images/image2.png" alt="Image">

<h1>프로젝트 기술스택</h1>
<h2>프론트엔드 (Front-end)</h2>
<ul>
  <li>Jsp : Spring Mvc패턴의 view단으로 사용하기위해 템플릿 역할로 사용하였습니다.</li>
  <li>Javascript : 메인페이지의 이미지슬라이드와 같은 동적인기능을 넣기위해 사용하였습니다.</li>
  <li>CSS : 웹 페이지의 스타일과 레이아웃을 정하기 위해 사용하였습니다.</li>
</ul>

<h2>백엔드 (Back-end)</h2>
<ul>
  <li>java(eclipse사용) : Restful Api를 구축하기 위해 사용하였습니다.</li>
</ul>

<h2>데이터베이스 (Database)</h2>
<ul>
  <li>Oracle : 회원/열차정보/예약정보 데이터를 저장하고 조회하기위해 사용하였습니다.</li>
</ul>

<h1>1. 메인페이지</h1>
<img src="/images/image3.png" alt="Image">

<h1>1-1) 메인페이지 - 열차조회</h1>
<img src="/images/image8.png" alt="Image">

<h1>1-2) 메인페이지 - 추천여행지</h1>
<img src="/images/image4.png" alt="Image">

<h1>1-3) 메인페이지 - 노선도</h1>
<img src="/images/image5.png" alt="Image">

<h1>2. 마이페이지</h1>
<h3>회원정보 수정클릭시 아이디를 제외한 항목들의 정보수정/회원탈퇴 가능</h3>
<img src="/images/image6.png" alt="Image">

<h1>2-1) 마이페이지 - 예약한 열차조회</h1>
<img src="/images/image7.png" alt="Image">
