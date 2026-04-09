import axiosInstance from "./api/axiosInstance";
import "./App.css";
import axios from "axios";

const serverIp = import.meta.env.VITE_API_SERVER_IP;
const API_URL = `${serverIp}/api/users`;
function App02() {
  //fetch 함수로 비동기 통신

  //////////axiosInstance사용하기/////////
  const axiosSelectAll = async () => {
    try {
      const result = await axios.get(API_URL);
      console.log("전체 목록:", result.data);
      result.data.forEach((user, index) => {
        console.log(`${index} = ${user.id} | ${user.name} | ${user.email}`);
      });
    } catch (err) {
      console.error(err);
    }
  };

  const axiosSelectedById = async () => {
    try {
      const result = await axiosInstance({
        method: "GET", //대소문자 가리지는 않음
        url: "users/5",
        //data:
      });

      console.log(result.data);
    } catch (err) {
      console.err(err);
    }
  };
  return (
    <>
      <h1>Axios Test</h1>
      <button onClick={axiosSelectAll}>get - selectAll</button>
      <button onClick={axiosSelectedById}>get - selectById</button>

      <h3> Spring boot 연동하기(CRUD)</h3>
      {/* <button onClick={insertUser}>post - user등록</button>
      <button onClick={deleteUser}>delete - user삭제</button>
      <button onClick={updateUser}>put - user수정</button>
      <button onClick={getbyId}>get - user 부분조회 </button>
      <button onClick={getUsers}>get - user전체조회</button> */}
    </>
  );
}

export default App02;
