package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// @Repository 자동으로 설정됨.
public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    // List<Memo> findAllByUsername(String username);

    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword); // contains에 값이 들어가지
}
