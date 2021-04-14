package com.tarun.simplemvvm.repository

import kotlinx.coroutines.delay


class MainRepository {

    suspend fun fetchData(): String{
        // write your logic here either fetch from db or from server
        delay(2000)
        return "Tarun:  Data fetched successfully"
    }

    suspend fun storeData() : String{
        // write your logic here either for eg. store data in db first then send to server or
        //store data only in local db not send to server or
        // send data to server based on application requirement
        delay(2000)
        return "Tarun: Data stored successfully"
    }

}