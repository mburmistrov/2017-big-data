package mburmistrov;

import mburmistrov.task1.WordCount;
import mburmistrov.task2.WordCertainPosition;
import mburmistrov.task2.WordSort;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.conf.Configuration;

public class TaskRunner {
  public static void main(String[] args) throws Exception{

    ToolRunner.run(
      new Configuration(),
      new WordCount(),
      new String[]{"input", "output/1"}
    );

    ToolRunner.run(
      new Configuration(),
      new WordSort(),
      new String[]{"output/1", "output/2"}
    );


    ToolRunner.run(
      new Configuration(),
      new WordCertainPosition(),
      new String[]{"output/2", "output/3", "6"}
    );

  }

}
