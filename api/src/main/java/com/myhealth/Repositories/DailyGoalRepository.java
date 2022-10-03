package com.myhealth.Repositories;

import com.myhealth.Entities.DailyGoal;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DailyGoalRepository extends JpaRepository<DailyGoal,Long> {
    List<DailyGoal> getDailyGoalsByPatientIdOrderByQuantityAsc(long patientId);
    List<DailyGoal> getDailyGoalsByPatientIdAndActivityId(long patientId,long activityId);
    List<DailyGoal> getDailyGoalsByPatientIdAndDateEqualsOrderByQuantityAsc(long patientId, Date date);
}
