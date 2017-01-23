package com.allstate.entities;

import com.allstate.enums.Status;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
@Data
public class Game {
    private int gameId;
    private Status status;
    private User uId;
    private Date created;
    private Date modified;
    private int version;

    @Id
    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Column(nullable = false, columnDefinition = "ENUM('Won', 'Lost')")
    @Enumerated(EnumType.STRING)
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @ManyToOne
    public User getuId() {
        return uId;
    }

    public void setuId(User uId) {
        this.uId = uId;
    }

    @CreationTimestamp
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }

    @UpdateTimestamp
    public Date getModified() {
        return modified;
    }
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

}
