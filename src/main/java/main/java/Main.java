package main.java;

/*
    1. 회원 CRUD 프로젝트 MemberManager
       - dao: MemberDao
       - db: DBConnection
       - entity: Member
       - manager: MemberManager

    2. 게시판 CRUD 프로젝트 (+ MVC 패턴)
       - dao: PostDao
       - db: DBConnection
       - entity: Post
       - service (비즈니스 로직 처리): PostService
       - view: PostView
       - manager: PostManager
 */

import main.java.manager.PostManager;

public class Main {
    public static void main(String[] args) {
//        MemberManager memberManager = new MemberManager();
//
//        try {
//            memberManager.run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        PostManager pm = new PostManager();

        try {
            pm.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}