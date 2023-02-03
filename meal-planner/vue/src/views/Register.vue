<template>
  <div id="register" class="text-center">
    <form class="form-register" @submit.prevent="register">
      <h1 id="cookingText">Let's get Cooking!</h1>
    <div class="box">
      <div  class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
      <label  for="firstName" class="sr-only"></label>
      <input
        type="text"
        id="firstName"
        class="form-control"
        placeholder="First Name"
        v-model="user.firstName"
        required
        autofocus
      />
      <label  for="lastName" class="sr-only"></label>
      <input
        type="text"
        id="lastName"
        class="form-control"
        placeholder="Last Name"
        v-model="user.lastName"
        required
        autofocus
      />
      <label  for="username" class="sr-only"></label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label  for="password" class="sr-only"></label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
     
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      <br>
      <router-link id="loginLink" :to="{ name: 'login' }">Have an account?</router-link>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
    </div>
    </form>
  </div>
</template>

<script>
import authService from '../services/AuthService';

export default {
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'Bad Request: Validation Errors';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
  created(){
        this.$store.commit('UPDATE_PAGE', 'registerPage')
    },
};
</script>

<style>
#cookingText{
    text-align: center;
    padding-top: 140px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 50px;
    color: rgb(7, 85, 7);
}

body{
    background-image: src="food.png";
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
}

.box{
    width: 600px;
    height: 330px;
    border: 2px solid rgb(156, 156, 156);
    margin: auto;
    background-color: white;
}

.freeText{
    padding-left: 40px;
    padding-top: 30px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-weight: bold;
    font-size: 25px;
}

#firstName{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    width: 215px;
    height: 30px;
    padding-left: 20px;
    font-size: 15px;
    margin-left: 40px;
    margin-top: 30px;
    margin-right: 20px;
}

#lastName{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    width: 215px;
    height: 30px;
    padding-left: 10px;
    font-size: 15px;
}

#username{
    margin-left: 40px;
    padding-left: 10px;
    margin-top: 20px;
    height: 30px;
    padding-right: 275px;
    height: 30px;
    font-size: 15px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

#confirmPassword{
  font-size: 15px;
   height: 30px;
    margin-left: 40px;
    padding-left: 10px;
    margin-top: 20px;
    padding-right: 275px;
    height: 30px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

#password{
  font-size: 15px;
    height: 30px;
    margin-left: 40px;
    padding-left: 10px;
    margin-top: 20px;
    padding-right: 275px;
    height: 30px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

button{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    margin-left: 40px;
    margin-top: 20px;
    color: white;
    background-color: #0B6E4F;
    border-color:#0B6E4F;
    width: 150px;
    height: 50px;
    border: solid green 3px;
    border-radius: 8px;
    padding: 10px 10px;
    font-size: 15px;
}


#loginLink{
  margin-left: 40px;
  margin-right: 150px;
  font-size: 15px;
  border: solid green 3px;
  border-radius: 8px;
  background-color: white;
  color: green;
  font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
  padding: 10px 10px;
}
</style>
