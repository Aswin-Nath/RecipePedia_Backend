package com.Recipe.RecipePedia.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "likes")
@IdClass(UserLike.CompositeKey.class)
public class UserLike {

    @Id
    @Column(name = "postid")
    private long postid;

    @Id
    @Column(name = "userid")
    private long userid;

    public long getpostid() {
        return postid;
    }

    public void setpostid(long postid) {
        this.postid = postid;
    }

    public long getuserid() {
        return userid;
    }

    public void setuserid(long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "UserLike{postid=" + postid + ", userid=" + userid + "}";
    }

    // Static class for composite key
    public static class CompositeKey implements Serializable {
        private long postid;
        private long userid;

        public CompositeKey() {}

        public CompositeKey(long postid, long userid) {
            this.postid = postid;
            this.userid = userid;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompositeKey that = (CompositeKey) o;
            return postid == that.postid && userid == that.userid;
        }

        @Override
        public int hashCode() {
            return Objects.hash(postid, userid);
        }
    }
}
