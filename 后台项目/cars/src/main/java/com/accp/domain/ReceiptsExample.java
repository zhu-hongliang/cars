package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ReceiptsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptsExample() {
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

        public Criteria andResidIsNull() {
            addCriterion("resid is null");
            return (Criteria) this;
        }

        public Criteria andResidIsNotNull() {
            addCriterion("resid is not null");
            return (Criteria) this;
        }

        public Criteria andResidEqualTo(Integer value) {
            addCriterion("resid =", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotEqualTo(Integer value) {
            addCriterion("resid <>", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThan(Integer value) {
            addCriterion("resid >", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resid >=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThan(Integer value) {
            addCriterion("resid <", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThanOrEqualTo(Integer value) {
            addCriterion("resid <=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidIn(List<Integer> values) {
            addCriterion("resid in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotIn(List<Integer> values) {
            addCriterion("resid not in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidBetween(Integer value1, Integer value2) {
            addCriterion("resid between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotBetween(Integer value1, Integer value2) {
            addCriterion("resid not between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andResnameIsNull() {
            addCriterion("resname is null");
            return (Criteria) this;
        }

        public Criteria andResnameIsNotNull() {
            addCriterion("resname is not null");
            return (Criteria) this;
        }

        public Criteria andResnameEqualTo(String value) {
            addCriterion("resname =", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotEqualTo(String value) {
            addCriterion("resname <>", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThan(String value) {
            addCriterion("resname >", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThanOrEqualTo(String value) {
            addCriterion("resname >=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThan(String value) {
            addCriterion("resname <", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThanOrEqualTo(String value) {
            addCriterion("resname <=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLike(String value) {
            addCriterion("resname like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotLike(String value) {
            addCriterion("resname not like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameIn(List<String> values) {
            addCriterion("resname in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotIn(List<String> values) {
            addCriterion("resname not in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameBetween(String value1, String value2) {
            addCriterion("resname between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotBetween(String value1, String value2) {
            addCriterion("resname not between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andRessfqIsNull() {
            addCriterion("ressfq is null");
            return (Criteria) this;
        }

        public Criteria andRessfqIsNotNull() {
            addCriterion("ressfq is not null");
            return (Criteria) this;
        }

        public Criteria andRessfqEqualTo(Integer value) {
            addCriterion("ressfq =", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqNotEqualTo(Integer value) {
            addCriterion("ressfq <>", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqGreaterThan(Integer value) {
            addCriterion("ressfq >", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqGreaterThanOrEqualTo(Integer value) {
            addCriterion("ressfq >=", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqLessThan(Integer value) {
            addCriterion("ressfq <", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqLessThanOrEqualTo(Integer value) {
            addCriterion("ressfq <=", value, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqIn(List<Integer> values) {
            addCriterion("ressfq in", values, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqNotIn(List<Integer> values) {
            addCriterion("ressfq not in", values, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqBetween(Integer value1, Integer value2) {
            addCriterion("ressfq between", value1, value2, "ressfq");
            return (Criteria) this;
        }

        public Criteria andRessfqNotBetween(Integer value1, Integer value2) {
            addCriterion("ressfq not between", value1, value2, "ressfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqIsNull() {
            addCriterion("resfsfq is null");
            return (Criteria) this;
        }

        public Criteria andResfsfqIsNotNull() {
            addCriterion("resfsfq is not null");
            return (Criteria) this;
        }

        public Criteria andResfsfqEqualTo(Integer value) {
            addCriterion("resfsfq =", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqNotEqualTo(Integer value) {
            addCriterion("resfsfq <>", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqGreaterThan(Integer value) {
            addCriterion("resfsfq >", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqGreaterThanOrEqualTo(Integer value) {
            addCriterion("resfsfq >=", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqLessThan(Integer value) {
            addCriterion("resfsfq <", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqLessThanOrEqualTo(Integer value) {
            addCriterion("resfsfq <=", value, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqIn(List<Integer> values) {
            addCriterion("resfsfq in", values, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqNotIn(List<Integer> values) {
            addCriterion("resfsfq not in", values, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqBetween(Integer value1, Integer value2) {
            addCriterion("resfsfq between", value1, value2, "resfsfq");
            return (Criteria) this;
        }

        public Criteria andResfsfqNotBetween(Integer value1, Integer value2) {
            addCriterion("resfsfq not between", value1, value2, "resfsfq");
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