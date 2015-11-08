package com.fetched.io

import org.apache.hadoop.fs.FileSystem
import java.io.InputStreamReader
import java.io.BufferedReader
import scala.collection.mutable.ListBuffer

/**
 * @author samez
 */
class HDFSFetch(val inputReader : InputStreamReader) {
  /**
   * Fetches the list of Strings from the files
   */
  def lines : List[String] = {
    val bfreader = new BufferedReader(inputReader)
    val lineBuff = new ListBuffer[String]
    
    var line = bfreader.readLine()
    while(line!=null){
      lineBuff+=line
      line = bfreader.readLine()
    }
    lineBuff.toList
  }
  
  
  
}