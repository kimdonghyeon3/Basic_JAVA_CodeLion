# CodeLion
gitbash 이용법 숙지

## Getting Started

gitbash start

# Demo
기본 gitbash 사용법
```
cd path  //path = Working Directory 경로 (쉽게 말해서 작업 공간에서 최상위 폴더 경로)

git init //git 저장소 생성
//rm -rf .git 으로 저장소 삭제 가능

git add . //Working Directory -> Staging Area로 옮기기
//git rm --cashed . //Staging Area 모두 삭제

git commit -m "message" //Staging Area -> local Repository로 옮기기
//git log //Staging Area -> local Repository 이동 내역 조회

git push origin master //local Repository -> remote Repository로 옮기기


//단, 이때 github를 연동해주어야함 하는 방법은 아래와 같음
git config user.name
git config user.email

// 등록되어있는 name, email이 있는지 확인 없다면,
git config --global user.name "깃허브 아이디"
git config --global user.email "깃허브 이메일"

git remote add origin [github repository url] //원격 저장소 지정
//git remote remove origin //원격 저장소 삭제

git remote -v //원격저장소 확인
// 이후 push를 다시 지정하면 된다.
```

gitbash checkout
```
cd path  //path = Working Directory 경로 (쉽게 말해서 작업 공간에서 최상위 폴더 경로)

git init //git 저장소 생성
//rm -rf .git 으로 저장소 삭제 가능

git add . //Working Directory -> Staging Area로 옮기기
//git rm --cashed . //Staging Area 모두 삭제

git commit -m "message" //Staging Area -> local Repository로 옮기기
//git log //Staging Area -> local Repository 이동 내역 조회

git push origin master //local Repository -> remote Repository로 옮기기


//단, 이때 github를 연동해주어야함 하는 방법은 아래와 같음
git config user.name
git config user.email

// 등록되어있는 name, email이 있는지 확인 없다면,
git config --global user.name "깃허브 아이디"
git config --global user.email "깃허브 이메일"

git remote add origin [github repository url] //원격 저장소 지정
//git remote remove origin //원격 저장소 삭제

git remote -v //원격저장소 확인
// 이후 push를 다시 지정하면 된다.
```

# More Info
