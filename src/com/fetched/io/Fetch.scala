package com.fetched.io

import java.io.InputStreamReader
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path

/**
 * @author samez
 */
object Fetch {
  
  /**
   * Get the HDFSFetch object from the Path object, and using the default configuration 
   */
  def fromHDFS(path : Path) : HDFSFetch= {
   fromHDFS(path,new Configuration())
  }
  
  /**
   * Get the HDFSFetch object from file name.
   */
  def fromHDFS(name : String) : HDFSFetch = {
    fromHDFS(new Path(name))
  }
  
  /**
   * Get the HDFSFetch object form the Path object and the configuration object.
   */
  def fromHDFS(path : Path,conf : Configuration) = {
   val fileSystem = FileSystem.get(path.toUri(),new Configuration())
   val inputStreamReader = new InputStreamReader(fileSystem.open(path))
   createHDFSFetcher(inputStreamReader)
  }
  
  /**
   * Create and return the HDFSFetch Object.
   */
  def createHDFSFetcher(inputReader : InputStreamReader):HDFSFetch = {
    new HDFSFetch(inputReader)
  } 
 }



abstract class Fetch extends Iterator[Char]{
  
  
  
}
