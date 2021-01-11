package com.kgc.springboot2018.hangduo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultExample() {
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

        public Criteria andZidIsNull() {
            addCriterion("zid is null");
            return (Criteria) this;
        }

        public Criteria andZidIsNotNull() {
            addCriterion("zid is not null");
            return (Criteria) this;
        }

        public Criteria andZidEqualTo(Integer value) {
            addCriterion("zid =", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotEqualTo(Integer value) {
            addCriterion("zid <>", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThan(Integer value) {
            addCriterion("zid >", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zid >=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThan(Integer value) {
            addCriterion("zid <", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThanOrEqualTo(Integer value) {
            addCriterion("zid <=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidIn(List<Integer> values) {
            addCriterion("zid in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotIn(List<Integer> values) {
            addCriterion("zid not in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidBetween(Integer value1, Integer value2) {
            addCriterion("zid between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotBetween(Integer value1, Integer value2) {
            addCriterion("zid not between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZcontentIsNull() {
            addCriterion("zcontent is null");
            return (Criteria) this;
        }

        public Criteria andZcontentIsNotNull() {
            addCriterion("zcontent is not null");
            return (Criteria) this;
        }

        public Criteria andZcontentEqualTo(String value) {
            addCriterion("zcontent =", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentNotEqualTo(String value) {
            addCriterion("zcontent <>", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentGreaterThan(String value) {
            addCriterion("zcontent >", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentGreaterThanOrEqualTo(String value) {
            addCriterion("zcontent >=", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentLessThan(String value) {
            addCriterion("zcontent <", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentLessThanOrEqualTo(String value) {
            addCriterion("zcontent <=", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentLike(String value) {
            addCriterion("zcontent like", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentNotLike(String value) {
            addCriterion("zcontent not like", value, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentIn(List<String> values) {
            addCriterion("zcontent in", values, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentNotIn(List<String> values) {
            addCriterion("zcontent not in", values, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentBetween(String value1, String value2) {
            addCriterion("zcontent between", value1, value2, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZcontentNotBetween(String value1, String value2) {
            addCriterion("zcontent not between", value1, value2, "zcontent");
            return (Criteria) this;
        }

        public Criteria andZphoneIsNull() {
            addCriterion("zphone is null");
            return (Criteria) this;
        }

        public Criteria andZphoneIsNotNull() {
            addCriterion("zphone is not null");
            return (Criteria) this;
        }

        public Criteria andZphoneEqualTo(String value) {
            addCriterion("zphone =", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneNotEqualTo(String value) {
            addCriterion("zphone <>", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneGreaterThan(String value) {
            addCriterion("zphone >", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneGreaterThanOrEqualTo(String value) {
            addCriterion("zphone >=", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneLessThan(String value) {
            addCriterion("zphone <", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneLessThanOrEqualTo(String value) {
            addCriterion("zphone <=", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneLike(String value) {
            addCriterion("zphone like", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneNotLike(String value) {
            addCriterion("zphone not like", value, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneIn(List<String> values) {
            addCriterion("zphone in", values, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneNotIn(List<String> values) {
            addCriterion("zphone not in", values, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneBetween(String value1, String value2) {
            addCriterion("zphone between", value1, value2, "zphone");
            return (Criteria) this;
        }

        public Criteria andZphoneNotBetween(String value1, String value2) {
            addCriterion("zphone not between", value1, value2, "zphone");
            return (Criteria) this;
        }

        public Criteria andZtimeIsNull() {
            addCriterion("ztime is null");
            return (Criteria) this;
        }

        public Criteria andZtimeIsNotNull() {
            addCriterion("ztime is not null");
            return (Criteria) this;
        }

        public Criteria andZtimeEqualTo(Date value) {
            addCriterion("ztime =", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeNotEqualTo(Date value) {
            addCriterion("ztime <>", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeGreaterThan(Date value) {
            addCriterion("ztime >", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ztime >=", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeLessThan(Date value) {
            addCriterion("ztime <", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeLessThanOrEqualTo(Date value) {
            addCriterion("ztime <=", value, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeIn(List<Date> values) {
            addCriterion("ztime in", values, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeNotIn(List<Date> values) {
            addCriterion("ztime not in", values, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeBetween(Date value1, Date value2) {
            addCriterion("ztime between", value1, value2, "ztime");
            return (Criteria) this;
        }

        public Criteria andZtimeNotBetween(Date value1, Date value2) {
            addCriterion("ztime not between", value1, value2, "ztime");
            return (Criteria) this;
        }

        public Criteria andZaddressIsNull() {
            addCriterion("zaddress is null");
            return (Criteria) this;
        }

        public Criteria andZaddressIsNotNull() {
            addCriterion("zaddress is not null");
            return (Criteria) this;
        }

        public Criteria andZaddressEqualTo(String value) {
            addCriterion("zaddress =", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressNotEqualTo(String value) {
            addCriterion("zaddress <>", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressGreaterThan(String value) {
            addCriterion("zaddress >", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressGreaterThanOrEqualTo(String value) {
            addCriterion("zaddress >=", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressLessThan(String value) {
            addCriterion("zaddress <", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressLessThanOrEqualTo(String value) {
            addCriterion("zaddress <=", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressLike(String value) {
            addCriterion("zaddress like", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressNotLike(String value) {
            addCriterion("zaddress not like", value, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressIn(List<String> values) {
            addCriterion("zaddress in", values, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressNotIn(List<String> values) {
            addCriterion("zaddress not in", values, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressBetween(String value1, String value2) {
            addCriterion("zaddress between", value1, value2, "zaddress");
            return (Criteria) this;
        }

        public Criteria andZaddressNotBetween(String value1, String value2) {
            addCriterion("zaddress not between", value1, value2, "zaddress");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andLawsNumIsNull() {
            addCriterion("laws_num is null");
            return (Criteria) this;
        }

        public Criteria andLawsNumIsNotNull() {
            addCriterion("laws_num is not null");
            return (Criteria) this;
        }

        public Criteria andLawsNumEqualTo(String value) {
            addCriterion("laws_num =", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumNotEqualTo(String value) {
            addCriterion("laws_num <>", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumGreaterThan(String value) {
            addCriterion("laws_num >", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumGreaterThanOrEqualTo(String value) {
            addCriterion("laws_num >=", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumLessThan(String value) {
            addCriterion("laws_num <", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumLessThanOrEqualTo(String value) {
            addCriterion("laws_num <=", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumLike(String value) {
            addCriterion("laws_num like", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumNotLike(String value) {
            addCriterion("laws_num not like", value, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumIn(List<String> values) {
            addCriterion("laws_num in", values, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumNotIn(List<String> values) {
            addCriterion("laws_num not in", values, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumBetween(String value1, String value2) {
            addCriterion("laws_num between", value1, value2, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andLawsNumNotBetween(String value1, String value2) {
            addCriterion("laws_num not between", value1, value2, "lawsNum");
            return (Criteria) this;
        }

        public Criteria andConIdIsNull() {
            addCriterion("con_id is null");
            return (Criteria) this;
        }

        public Criteria andConIdIsNotNull() {
            addCriterion("con_id is not null");
            return (Criteria) this;
        }

        public Criteria andConIdEqualTo(Integer value) {
            addCriterion("con_id =", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotEqualTo(Integer value) {
            addCriterion("con_id <>", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThan(Integer value) {
            addCriterion("con_id >", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_id >=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThan(Integer value) {
            addCriterion("con_id <", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThanOrEqualTo(Integer value) {
            addCriterion("con_id <=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdIn(List<Integer> values) {
            addCriterion("con_id in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotIn(List<Integer> values) {
            addCriterion("con_id not in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdBetween(Integer value1, Integer value2) {
            addCriterion("con_id between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("con_id not between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andZemailIsNull() {
            addCriterion("zemail is null");
            return (Criteria) this;
        }

        public Criteria andZemailIsNotNull() {
            addCriterion("zemail is not null");
            return (Criteria) this;
        }

        public Criteria andZemailEqualTo(String value) {
            addCriterion("zemail =", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailNotEqualTo(String value) {
            addCriterion("zemail <>", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailGreaterThan(String value) {
            addCriterion("zemail >", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailGreaterThanOrEqualTo(String value) {
            addCriterion("zemail >=", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailLessThan(String value) {
            addCriterion("zemail <", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailLessThanOrEqualTo(String value) {
            addCriterion("zemail <=", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailLike(String value) {
            addCriterion("zemail like", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailNotLike(String value) {
            addCriterion("zemail not like", value, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailIn(List<String> values) {
            addCriterion("zemail in", values, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailNotIn(List<String> values) {
            addCriterion("zemail not in", values, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailBetween(String value1, String value2) {
            addCriterion("zemail between", value1, value2, "zemail");
            return (Criteria) this;
        }

        public Criteria andZemailNotBetween(String value1, String value2) {
            addCriterion("zemail not between", value1, value2, "zemail");
            return (Criteria) this;
        }

        public Criteria andZnameIsNull() {
            addCriterion("zname is null");
            return (Criteria) this;
        }

        public Criteria andZnameIsNotNull() {
            addCriterion("zname is not null");
            return (Criteria) this;
        }

        public Criteria andZnameEqualTo(String value) {
            addCriterion("zname =", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotEqualTo(String value) {
            addCriterion("zname <>", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThan(String value) {
            addCriterion("zname >", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThanOrEqualTo(String value) {
            addCriterion("zname >=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThan(String value) {
            addCriterion("zname <", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThanOrEqualTo(String value) {
            addCriterion("zname <=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLike(String value) {
            addCriterion("zname like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotLike(String value) {
            addCriterion("zname not like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameIn(List<String> values) {
            addCriterion("zname in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotIn(List<String> values) {
            addCriterion("zname not in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameBetween(String value1, String value2) {
            addCriterion("zname between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotBetween(String value1, String value2) {
            addCriterion("zname not between", value1, value2, "zname");
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