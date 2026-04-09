import "./App.css";
import axios from "axios";
function App() {
  //fetch 함수로 비동기 통신
  const selectAll = async () => {
    try {
      const res = await fetch("https://jsonplaceholder.typicode.com/users");
      console.log(res);

      const jsonResult = await res.json();

      jsonResult.forEach((user, index) => {
        console.log(`${index} = ${user.id} | ${user.name} | ${user.email}`);
      });
    } catch (err) {
      console.log(err);
    }
  };
  //////////axios 사용하기/////////
  const axiosSelectAll = async () => {
    //   axios
    //     .get("https://jsonplaceholder.typicode.com/users")
    //     .then((result) => {
    //       console.log(result.data);
    //       result.data.forEach((user, index) => {
    //         console.log(`${index} = ${user.id} | ${user.name} | ${user.email}`);
    //       });
    //     })
    //     .catch((err) => {
    //       console.error(err);
    //     });
    // };
    //이 코드를 async와 await로 변경
    try {
      const result = await axios.get(
        "https://jsonplaceholder.typicode.com/users",
      );
      console.log(result.data);
      result.data.forEach((user, index) => {
        console.log(`${index} = ${user.id} | ${user.name} | ${user.email}`);
      });
    } catch (err) {
      console.error(err);
    }
  };

  // const axiosSelectedById = () => {
  //   axios({
  //     method: "GET", //대소문자 가리지는 않음
  //     url: "https://jsonplaceholder.typicode.com/users/5",
  //     //data:
  //   })
  //     .then((result) => {
  //       console.log(result.data);
  //     })
  //     .catch((err) => {
  //       console.err(err);
  //     });
  // };
  const axiosSelectedById = async () => {
    try {
      const result = await axios({
        method: "GET", //대소문자 가리지는 않음
        url: "https://jsonplaceholder.typicode.com/users/5",
        //data:
      });

      console.log(result.data);
    } catch (err) {
      console.err(err);
    }
  };
  return (
    <>
      <h1>fetch Test</h1>
      <button onClick={selectAll}>get - selectAll</button>

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

export default App;
