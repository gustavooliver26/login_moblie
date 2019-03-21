package com.example.aluno.myapplication

class SimulaBD {

    companion object {
        public fun Login(username:String, password:String )  : Boolean {
           var ret: Boolean = false
            if(username is String && password is String){
                if (username.equals("admin") && password .equals("admin123")){
                    ret = true;
                }

            }
            return ret;
        }

    }
}