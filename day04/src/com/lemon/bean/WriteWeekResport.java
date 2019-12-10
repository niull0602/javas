package com.lemon.bean;

import java.io.*;

/**
 * Created by lemon on 2019-12-10 11:02.
 */
public class WriteWeekResport {
    private Integer id;
    private Integer memberId;
    private String content;
    private String filePath;
    private Integer presidentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getPresidentId() {
        return presidentId;
    }

    public void setPresidentId(Integer presidentId) {
        this.presidentId = presidentId;
    }

    public void writeWeekResport() throws IOException {
        File file=new File(filePath);
        Writer writer=new OutputStreamWriter(new FileOutputStream(file));
        writer.write(content);
        writer.close();
    }

    public void readWeekResport(Student student,int i) throws IOException {
        File file=new File("C:\\Users\\Administrator\\Desktop\\test\\" + student.getName()+i+".txt");
        Reader reader = new InputStreamReader(new FileInputStream(file));
        char[] chars = new char[1024];
        int len = reader.read(chars);
        System.out.println(new String(chars,0,len));
        reader.close();
    }
    @Override
    public String toString() {
        return "WriteWeekResport{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", content='" + content + '\'' +
                ", filePath='" + filePath + '\'' +
                ", presidentId=" + presidentId +
                '}';
    }
}
