package com.antoine.goaltrackerbackend.models;

import com.antoine.goaltrackerbackend.models.enums.DaysOfTheWeek;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "habit")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = false)
    private Double rate;

    @Column(nullable = false)
    private Double currentNumber;

    @Column(nullable = false)
    private Double targetNumber;

    @Column(nullable = false)
    private List<DaysOfTheWeek> daysOfTheWeekList;

    @ManyToOne
    @JoinColumn(name = "goal_id", nullable = false)
    private Goal goal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Double currentNumber) {
        this.currentNumber = currentNumber;
    }

    public Double getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(Double targetNumber) {
        this.targetNumber = targetNumber;
    }

    public List<DaysOfTheWeek> getDaysOfTheWeekList() {
        return daysOfTheWeekList;
    }

    public void setDaysOfTheWeekList(List<DaysOfTheWeek> daysOfTheWeekList) {
        this.daysOfTheWeekList = daysOfTheWeekList;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}
