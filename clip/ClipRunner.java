package com.xworkz.clip;

import com.xworkz.clip.paperclip.Paperclip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip = new Clip();
        clip.hold();
        clip.toattach();

        Paperclip paperclip = new Paperclip();
        paperclip.hold();
        paperclip.toattach();

        Clip clip1 = new Paperclip();
        Paperclip paperclip1 = (Paperclip) clip1;
        System.out.println(paperclip1);
    }

}
