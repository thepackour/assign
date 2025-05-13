### 1. github에서 assign 디렉토리로 이동

### 2. Issues - New issue
- 제목 예시: 5월 2주차 과제 제출

### 3. 오른쪽 Development 탭 - Create a branch
- 이름 예시: JiseongHan/5-2
- Repo dest: thepackour/assign
- Branch Source: main

### 4. Local Repo로 checkout
- 현재 디렉토리 확인 후 명령어 실행
- ``git fetch origin``
- ``git checkout [branch_name]``

### 5. 작업 및 push 완료
- commit 메시지로 뭐 했는지 적기 (한글 적으면 깨짐)

### 6. Pull requests - Compare & pull request
- 변경 사항이 있으면 알아서 'Compare & pull request'가 나옴
- base: main
- compare: [branch name]
- 제목 예시: 한지성 5월 2주차 과제 제출합니다.
- 설명란에 질문 작성

### 7. pull request 링크 업로드
- 링크 예시: ``https://github.com/thepackour/assign/pull/3``

---

### 기타 명령어들

``git add .``
현재 디렉토리의 모든 파일 add

``git restore --staged [file_name]``
add한 파일 취소

``git checkout [branch_name]``
branch로 이동

``git checkout [file_name]``
unstaged 파일을 마지막 commit 시점으로 돌림

``git reset --mixed HEAD^``
마지막 commit 삭제 (working dir에 변경사항 적용 시 checkout 필요)

``git reset --hard HEAD``
현재 staging area에 변경사항 취소 + working dir에도 적용 (checkout 할 필요 X)

``git fetch origin``
remote repo 확인

``git pull``
remote repo에서 데이터 가져오기 (fetch + merge)

``git status``
현재 git 프로젝트의 상태 표시

``git branch --d [branch_name]``
branch 삭제 (현재 작업중인 branch는 안됨)

### 그 외 유의사항
- 입력란 맨 앞이 ``$``가 아닌 ``:``인 경우 ``q``누르기
- ``git commit`` 후 다시 ``git add`` 해줘야 함
- ``HEAD``는 현재 staging area, ``HEAD^``는 마지막 commit을 가리킴