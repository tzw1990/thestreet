import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zihan.wang on 7/18/14.
 */
public class ValJ {

    public static void test() throws IOException {
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        Template template = ve.getTemplate("test.vm");
        VelocityContext context = new VelocityContext();

        context.put("name", "Liang");
        context.put("date", (new Date()).toString());

        List temp = new ArrayList();
        temp.add("e2");
        temp.add("e1");

        context.put("list", temp);


        //context.put("list", getNames());


        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));

        if(template!=null){
            template.merge(context,writer);
        }

        writer.flush();
        writer.close();
    }

    public static void main(String[] args){
        try{
            test();
        }
        catch(IOException e){e.printStackTrace();}

    }

}
