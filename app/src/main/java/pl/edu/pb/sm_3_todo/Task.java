package pl.edu.pb.sm_3_todo;

import java.util.Date;
import java.util.UUID;
import java.lang.*;


    public class Task {
        private UUID id;
        private String name;
        private Date date;
        private boolean done;

        public Task() {
            id = UUID.randomUUID();
            date = new Date();
        }
    }
