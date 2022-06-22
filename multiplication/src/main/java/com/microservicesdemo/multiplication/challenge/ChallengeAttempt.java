package com.microservicesdemo.multiplication.challenge;

import com.microservicesdemo.multiplication.user.User;

import javax.persistence.*;

@Entity
public class ChallengeAttempt {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;

    public ChallengeAttempt() {}

    public ChallengeAttempt(Long id, User user, int factorA, int factorB, int resultAttempt, boolean correct) {
        this.id = id;
        this.user = user;
        this.factorA = factorA;
        this.factorB = factorB;
        this.resultAttempt = resultAttempt;
        this.correct = correct;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResultAttempt() {
        return resultAttempt;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    public void setResultAttempt(int resultAttempt) {
        this.resultAttempt = resultAttempt;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "ChallengeAttempt{" +
                "id=" + id +
                ", user=" + user +
                ", factorA=" + factorA +
                ", factorB=" + factorB +
                ", resultAttempt=" + resultAttempt +
                ", correct=" + correct +
                '}';
    }
}
