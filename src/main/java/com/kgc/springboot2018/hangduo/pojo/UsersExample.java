package com.kgc.springboot2018.hangduo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("up_name is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("up_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("up_name =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("up_name <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("up_name >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("up_name >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("up_name <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("up_name <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("up_name like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("up_name not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("up_name in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("up_name not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("up_name between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("up_name not between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpPhoneIsNull() {
            addCriterion("up_phone is null");
            return (Criteria) this;
        }

        public Criteria andUpPhoneIsNotNull() {
            addCriterion("up_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUpPhoneEqualTo(String value) {
            addCriterion("up_phone =", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneNotEqualTo(String value) {
            addCriterion("up_phone <>", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneGreaterThan(String value) {
            addCriterion("up_phone >", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("up_phone >=", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneLessThan(String value) {
            addCriterion("up_phone <", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneLessThanOrEqualTo(String value) {
            addCriterion("up_phone <=", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneLike(String value) {
            addCriterion("up_phone like", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneNotLike(String value) {
            addCriterion("up_phone not like", value, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneIn(List<String> values) {
            addCriterion("up_phone in", values, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneNotIn(List<String> values) {
            addCriterion("up_phone not in", values, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneBetween(String value1, String value2) {
            addCriterion("up_phone between", value1, value2, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpPhoneNotBetween(String value1, String value2) {
            addCriterion("up_phone not between", value1, value2, "upPhone");
            return (Criteria) this;
        }

        public Criteria andUpSexIsNull() {
            addCriterion("up_sex is null");
            return (Criteria) this;
        }

        public Criteria andUpSexIsNotNull() {
            addCriterion("up_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUpSexEqualTo(Integer value) {
            addCriterion("up_sex =", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotEqualTo(Integer value) {
            addCriterion("up_sex <>", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexGreaterThan(Integer value) {
            addCriterion("up_sex >", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_sex >=", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexLessThan(Integer value) {
            addCriterion("up_sex <", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexLessThanOrEqualTo(Integer value) {
            addCriterion("up_sex <=", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexIn(List<Integer> values) {
            addCriterion("up_sex in", values, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotIn(List<Integer> values) {
            addCriterion("up_sex not in", values, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexBetween(Integer value1, Integer value2) {
            addCriterion("up_sex between", value1, value2, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotBetween(Integer value1, Integer value2) {
            addCriterion("up_sex not between", value1, value2, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpViptypeIsNull() {
            addCriterion("up_VIPType is null");
            return (Criteria) this;
        }

        public Criteria andUpViptypeIsNotNull() {
            addCriterion("up_VIPType is not null");
            return (Criteria) this;
        }

        public Criteria andUpViptypeEqualTo(Integer value) {
            addCriterion("up_VIPType =", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeNotEqualTo(Integer value) {
            addCriterion("up_VIPType <>", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeGreaterThan(Integer value) {
            addCriterion("up_VIPType >", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_VIPType >=", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeLessThan(Integer value) {
            addCriterion("up_VIPType <", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeLessThanOrEqualTo(Integer value) {
            addCriterion("up_VIPType <=", value, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeIn(List<Integer> values) {
            addCriterion("up_VIPType in", values, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeNotIn(List<Integer> values) {
            addCriterion("up_VIPType not in", values, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeBetween(Integer value1, Integer value2) {
            addCriterion("up_VIPType between", value1, value2, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpViptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("up_VIPType not between", value1, value2, "upViptype");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNull() {
            addCriterion("up_date is null");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNotNull() {
            addCriterion("up_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpDateEqualTo(Date value) {
            addCriterion("up_date =", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotEqualTo(Date value) {
            addCriterion("up_date <>", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThan(Date value) {
            addCriterion("up_date >", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("up_date >=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThan(Date value) {
            addCriterion("up_date <", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThanOrEqualTo(Date value) {
            addCriterion("up_date <=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateIn(List<Date> values) {
            addCriterion("up_date in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotIn(List<Date> values) {
            addCriterion("up_date not in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateBetween(Date value1, Date value2) {
            addCriterion("up_date between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotBetween(Date value1, Date value2) {
            addCriterion("up_date not between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andIpPasswordIsNull() {
            addCriterion("ip_password is null");
            return (Criteria) this;
        }

        public Criteria andIpPasswordIsNotNull() {
            addCriterion("ip_password is not null");
            return (Criteria) this;
        }

        public Criteria andIpPasswordEqualTo(String value) {
            addCriterion("ip_password =", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordNotEqualTo(String value) {
            addCriterion("ip_password <>", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordGreaterThan(String value) {
            addCriterion("ip_password >", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ip_password >=", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordLessThan(String value) {
            addCriterion("ip_password <", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordLessThanOrEqualTo(String value) {
            addCriterion("ip_password <=", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordLike(String value) {
            addCriterion("ip_password like", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordNotLike(String value) {
            addCriterion("ip_password not like", value, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordIn(List<String> values) {
            addCriterion("ip_password in", values, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordNotIn(List<String> values) {
            addCriterion("ip_password not in", values, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordBetween(String value1, String value2) {
            addCriterion("ip_password between", value1, value2, "ipPassword");
            return (Criteria) this;
        }

        public Criteria andIpPasswordNotBetween(String value1, String value2) {
            addCriterion("ip_password not between", value1, value2, "ipPassword");
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