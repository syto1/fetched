package com.fetched.requests

import com.fetched.io.Fetch


/**
 * @author samez
 */
object FetchShell extends App {
   
  
  Fetch.fromHDFS("hdfs://192.168.189.128:8020/user/guest/data/test.txt")
       .lines
       .filter(_.contains("line"))
       .foreach(println)
      
  
  
}