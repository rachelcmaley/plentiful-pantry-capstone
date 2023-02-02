<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <h1 id="signInText">Welcome Back! </h1>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label id="usernameBox" for="username" class="sr-only"></label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label id="passwordBox" for="password" class="sr-only"></label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <button id="register" :to="{ name: 'register' }">Register Now</button>
      <button id="signIn" type="submit">Sign in</button>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};


</script>

<style scoped>

#signInText{
    font-size: 50px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    text-align: center;
    padding-top: 200px;
    color: black;
}

body{
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
}

.box{
    width: 600px;
    height: 300px;
    border: 2px solid rgb(156, 156, 156);
    margin: auto;
}

div{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 20px;
    margin-left: 670px;
    margin-top: 230px;
    height: 300px;
    width: 600px;
    font-weight: bold;
    background-color: white;
}

.loginText{
    padding-top: 40px;
    padding-left: 40px;
    font-weight: bold;
    font-size: 25px;
}

#usernameBox{
    display: block;
    width: 400px;
    height: 35px;
    font-size: large;
    margin-top: 20px;
    margin-left: 40px;
}

#passwordBox{
    display: block;
    width: 400px;
    height: 35px;
    font-size: large;
    margin-top: 20px;
    margin-left: 40px;
}

button{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    border-radius: 6px;
    margin-top: 20px;
    margin-left: 40px;
    font-size: 20px;
}

#register{
  background-color: green;
  color: white;
  width: 170px;
  height: 50px;
}

#signIn{
  background-color: white;
  border-color: green;
  color: green;
    width: 100px;
    height: 50px;
}


</style>