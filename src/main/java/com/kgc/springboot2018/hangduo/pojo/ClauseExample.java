package com.kgc.springboot2018.hangduo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClauseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClauseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClauseIdIsNull() {
            addCriterion("clause_id is null");
            return (Criteria) this;
        }

        public Criteria andClauseIdIsNotNull() {
            addCriterion("clause_id is not null");
            return (Criteria) this;
        }

        public Criteria andClauseIdEqualTo(String value) {
            addCriterion("clause_id =", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdNotEqualTo(String value) {
            addCriterion("clause_id <>", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdGreaterThan(String value) {
            addCriterion("clause_id >", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdGreaterThanOrEqualTo(String value) {
            addCriterion("clause_id >=", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdLessThan(String value) {
            addCriterion("clause_id <", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdLessThanOrEqualTo(String value) {
            addCriterion("clause_id <=", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdLike(String value) {
            addCriterion("clause_id like", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdNotLike(String value) {
            addCriterion("clause_id not like", value, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdIn(List<String> values) {
            addCriterion("clause_id in", values, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdNotIn(List<String> values) {
            addCriterion("clause_id not in", values, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdBetween(String value1, String value2) {
            addCriterion("clause_id between", value1, value2, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseIdNotBetween(String value1, String value2) {
            addCriterion("clause_id not between", value1, value2, "clauseId");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameIsNull() {
            addCriterion("clause_realName is null");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameIsNotNull() {
            addCriterion("clause_realName is not null");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameEqualTo(String value) {
            addCriterion("clause_realName =", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameNotEqualTo(String value) {
            addCriterion("clause_realName <>", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameGreaterThan(String value) {
            addCriterion("clause_realName >", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("clause_realName >=", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameLessThan(String value) {
            addCriterion("clause_realName <", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameLessThanOrEqualTo(String value) {
            addCriterion("clause_realName <=", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameLike(String value) {
            addCriterion("clause_realName like", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameNotLike(String value) {
            addCriterion("clause_realName not like", value, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameIn(List<String> values) {
            addCriterion("clause_realName in", values, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameNotIn(List<String> values) {
            addCriterion("clause_realName not in", values, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameBetween(String value1, String value2) {
            addCriterion("clause_realName between", value1, value2, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseRealnameNotBetween(String value1, String value2) {
            addCriterion("clause_realName not between", value1, value2, "clauseRealname");
            return (Criteria) this;
        }

        public Criteria andClauseTitleIsNull() {
            addCriterion("clause_title is null");
            return (Criteria) this;
        }

        public Criteria andClauseTitleIsNotNull() {
            addCriterion("clause_title is not null");
            return (Criteria) this;
        }

        public Criteria andClauseTitleEqualTo(String value) {
            addCriterion("clause_title =", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleNotEqualTo(String value) {
            addCriterion("clause_title <>", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleGreaterThan(String value) {
            addCriterion("clause_title >", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("clause_title >=", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleLessThan(String value) {
            addCriterion("clause_title <", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleLessThanOrEqualTo(String value) {
            addCriterion("clause_title <=", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleLike(String value) {
            addCriterion("clause_title like", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleNotLike(String value) {
            addCriterion("clause_title not like", value, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleIn(List<String> values) {
            addCriterion("clause_title in", values, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleNotIn(List<String> values) {
            addCriterion("clause_title not in", values, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleBetween(String value1, String value2) {
            addCriterion("clause_title between", value1, value2, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseTitleNotBetween(String value1, String value2) {
            addCriterion("clause_title not between", value1, value2, "clauseTitle");
            return (Criteria) this;
        }

        public Criteria andClauseNameIsNull() {
            addCriterion("clause_name is null");
            return (Criteria) this;
        }

        public Criteria andClauseNameIsNotNull() {
            addCriterion("clause_name is not null");
            return (Criteria) this;
        }

        public Criteria andClauseNameEqualTo(String value) {
            addCriterion("clause_name =", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameNotEqualTo(String value) {
            addCriterion("clause_name <>", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameGreaterThan(String value) {
            addCriterion("clause_name >", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameGreaterThanOrEqualTo(String value) {
            addCriterion("clause_name >=", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameLessThan(String value) {
            addCriterion("clause_name <", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameLessThanOrEqualTo(String value) {
            addCriterion("clause_name <=", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameLike(String value) {
            addCriterion("clause_name like", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameNotLike(String value) {
            addCriterion("clause_name not like", value, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameIn(List<String> values) {
            addCriterion("clause_name in", values, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameNotIn(List<String> values) {
            addCriterion("clause_name not in", values, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameBetween(String value1, String value2) {
            addCriterion("clause_name between", value1, value2, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNameNotBetween(String value1, String value2) {
            addCriterion("clause_name not between", value1, value2, "clauseName");
            return (Criteria) this;
        }

        public Criteria andClauseNumIsNull() {
            addCriterion("clause_num is null");
            return (Criteria) this;
        }

        public Criteria andClauseNumIsNotNull() {
            addCriterion("clause_num is not null");
            return (Criteria) this;
        }

        public Criteria andClauseNumEqualTo(String value) {
            addCriterion("clause_num =", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumNotEqualTo(String value) {
            addCriterion("clause_num <>", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumGreaterThan(String value) {
            addCriterion("clause_num >", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumGreaterThanOrEqualTo(String value) {
            addCriterion("clause_num >=", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumLessThan(String value) {
            addCriterion("clause_num <", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumLessThanOrEqualTo(String value) {
            addCriterion("clause_num <=", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumLike(String value) {
            addCriterion("clause_num like", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumNotLike(String value) {
            addCriterion("clause_num not like", value, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumIn(List<String> values) {
            addCriterion("clause_num in", values, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumNotIn(List<String> values) {
            addCriterion("clause_num not in", values, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumBetween(String value1, String value2) {
            addCriterion("clause_num between", value1, value2, "clauseNum");
            return (Criteria) this;
        }

        public Criteria andClauseNumNotBetween(String value1, String value2) {
            addCriterion("clause_num not between", value1, value2, "clauseNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}