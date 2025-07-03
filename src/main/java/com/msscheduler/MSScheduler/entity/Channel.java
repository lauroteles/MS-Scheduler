package com.msscheduler.MSScheduler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_channels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Channel {

    @Id
    private Long channel_id;

    private String description;

    public Channel(Long id, String description) {
    }

    public enum Values {
        EMAIL(1,"email"),
        SMS(2,"sms"),
        PUSH(3,"push"),
        WHATSAPP(4,"whatsapp");

        Values(int i, String email) {

        }
    }

    private Long id;

    void Values(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Channel toChannel () {
        return new Channel(id, description);
    }
    


}
