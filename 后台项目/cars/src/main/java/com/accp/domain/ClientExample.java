package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andCltidIsNull() {
            addCriterion("cltid is null");
            return (Criteria) this;
        }

        public Criteria andCltidIsNotNull() {
            addCriterion("cltid is not null");
            return (Criteria) this;
        }

        public Criteria andCltidEqualTo(String value) {
            addCriterion("cltid =", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotEqualTo(String value) {
            addCriterion("cltid <>", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThan(String value) {
            addCriterion("cltid >", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThanOrEqualTo(String value) {
            addCriterion("cltid >=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThan(String value) {
            addCriterion("cltid <", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThanOrEqualTo(String value) {
            addCriterion("cltid <=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLike(String value) {
            addCriterion("cltid like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotLike(String value) {
            addCriterion("cltid not like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidIn(List<String> values) {
            addCriterion("cltid in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotIn(List<String> values) {
            addCriterion("cltid not in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidBetween(String value1, String value2) {
            addCriterion("cltid between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotBetween(String value1, String value2) {
            addCriterion("cltid not between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltnameIsNull() {
            addCriterion("cltname is null");
            return (Criteria) this;
        }

        public Criteria andCltnameIsNotNull() {
            addCriterion("cltname is not null");
            return (Criteria) this;
        }

        public Criteria andCltnameEqualTo(String value) {
            addCriterion("cltname =", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameNotEqualTo(String value) {
            addCriterion("cltname <>", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameGreaterThan(String value) {
            addCriterion("cltname >", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameGreaterThanOrEqualTo(String value) {
            addCriterion("cltname >=", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameLessThan(String value) {
            addCriterion("cltname <", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameLessThanOrEqualTo(String value) {
            addCriterion("cltname <=", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameLike(String value) {
            addCriterion("cltname like", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameNotLike(String value) {
            addCriterion("cltname not like", value, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameIn(List<String> values) {
            addCriterion("cltname in", values, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameNotIn(List<String> values) {
            addCriterion("cltname not in", values, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameBetween(String value1, String value2) {
            addCriterion("cltname between", value1, value2, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltnameNotBetween(String value1, String value2) {
            addCriterion("cltname not between", value1, value2, "cltname");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanIsNull() {
            addCriterion("cltlinkman is null");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanIsNotNull() {
            addCriterion("cltlinkman is not null");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanEqualTo(String value) {
            addCriterion("cltlinkman =", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanNotEqualTo(String value) {
            addCriterion("cltlinkman <>", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanGreaterThan(String value) {
            addCriterion("cltlinkman >", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("cltlinkman >=", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanLessThan(String value) {
            addCriterion("cltlinkman <", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanLessThanOrEqualTo(String value) {
            addCriterion("cltlinkman <=", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanLike(String value) {
            addCriterion("cltlinkman like", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanNotLike(String value) {
            addCriterion("cltlinkman not like", value, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanIn(List<String> values) {
            addCriterion("cltlinkman in", values, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanNotIn(List<String> values) {
            addCriterion("cltlinkman not in", values, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanBetween(String value1, String value2) {
            addCriterion("cltlinkman between", value1, value2, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltlinkmanNotBetween(String value1, String value2) {
            addCriterion("cltlinkman not between", value1, value2, "cltlinkman");
            return (Criteria) this;
        }

        public Criteria andCltphoneIsNull() {
            addCriterion("cltphone is null");
            return (Criteria) this;
        }

        public Criteria andCltphoneIsNotNull() {
            addCriterion("cltphone is not null");
            return (Criteria) this;
        }

        public Criteria andCltphoneEqualTo(String value) {
            addCriterion("cltphone =", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneNotEqualTo(String value) {
            addCriterion("cltphone <>", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneGreaterThan(String value) {
            addCriterion("cltphone >", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cltphone >=", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneLessThan(String value) {
            addCriterion("cltphone <", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneLessThanOrEqualTo(String value) {
            addCriterion("cltphone <=", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneLike(String value) {
            addCriterion("cltphone like", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneNotLike(String value) {
            addCriterion("cltphone not like", value, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneIn(List<String> values) {
            addCriterion("cltphone in", values, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneNotIn(List<String> values) {
            addCriterion("cltphone not in", values, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneBetween(String value1, String value2) {
            addCriterion("cltphone between", value1, value2, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltphoneNotBetween(String value1, String value2) {
            addCriterion("cltphone not between", value1, value2, "cltphone");
            return (Criteria) this;
        }

        public Criteria andCltaddressIsNull() {
            addCriterion("cltaddress is null");
            return (Criteria) this;
        }

        public Criteria andCltaddressIsNotNull() {
            addCriterion("cltaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCltaddressEqualTo(String value) {
            addCriterion("cltaddress =", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressNotEqualTo(String value) {
            addCriterion("cltaddress <>", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressGreaterThan(String value) {
            addCriterion("cltaddress >", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cltaddress >=", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressLessThan(String value) {
            addCriterion("cltaddress <", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressLessThanOrEqualTo(String value) {
            addCriterion("cltaddress <=", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressLike(String value) {
            addCriterion("cltaddress like", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressNotLike(String value) {
            addCriterion("cltaddress not like", value, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressIn(List<String> values) {
            addCriterion("cltaddress in", values, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressNotIn(List<String> values) {
            addCriterion("cltaddress not in", values, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressBetween(String value1, String value2) {
            addCriterion("cltaddress between", value1, value2, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltaddressNotBetween(String value1, String value2) {
            addCriterion("cltaddress not between", value1, value2, "cltaddress");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayIsNull() {
            addCriterion("cltbirthday is null");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayIsNotNull() {
            addCriterion("cltbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayEqualTo(String value) {
            addCriterion("cltbirthday =", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayNotEqualTo(String value) {
            addCriterion("cltbirthday <>", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayGreaterThan(String value) {
            addCriterion("cltbirthday >", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("cltbirthday >=", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayLessThan(String value) {
            addCriterion("cltbirthday <", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayLessThanOrEqualTo(String value) {
            addCriterion("cltbirthday <=", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayLike(String value) {
            addCriterion("cltbirthday like", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayNotLike(String value) {
            addCriterion("cltbirthday not like", value, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayIn(List<String> values) {
            addCriterion("cltbirthday in", values, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayNotIn(List<String> values) {
            addCriterion("cltbirthday not in", values, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayBetween(String value1, String value2) {
            addCriterion("cltbirthday between", value1, value2, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltbirthdayNotBetween(String value1, String value2) {
            addCriterion("cltbirthday not between", value1, value2, "cltbirthday");
            return (Criteria) this;
        }

        public Criteria andCltpaymentIsNull() {
            addCriterion("cltpayment is null");
            return (Criteria) this;
        }

        public Criteria andCltpaymentIsNotNull() {
            addCriterion("cltpayment is not null");
            return (Criteria) this;
        }

        public Criteria andCltpaymentEqualTo(String value) {
            addCriterion("cltpayment =", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentNotEqualTo(String value) {
            addCriterion("cltpayment <>", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentGreaterThan(String value) {
            addCriterion("cltpayment >", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("cltpayment >=", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentLessThan(String value) {
            addCriterion("cltpayment <", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentLessThanOrEqualTo(String value) {
            addCriterion("cltpayment <=", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentLike(String value) {
            addCriterion("cltpayment like", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentNotLike(String value) {
            addCriterion("cltpayment not like", value, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentIn(List<String> values) {
            addCriterion("cltpayment in", values, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentNotIn(List<String> values) {
            addCriterion("cltpayment not in", values, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentBetween(String value1, String value2) {
            addCriterion("cltpayment between", value1, value2, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltpaymentNotBetween(String value1, String value2) {
            addCriterion("cltpayment not between", value1, value2, "cltpayment");
            return (Criteria) this;
        }

        public Criteria andCltlimitIsNull() {
            addCriterion("cltlimit is null");
            return (Criteria) this;
        }

        public Criteria andCltlimitIsNotNull() {
            addCriterion("cltlimit is not null");
            return (Criteria) this;
        }

        public Criteria andCltlimitEqualTo(Integer value) {
            addCriterion("cltlimit =", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitNotEqualTo(Integer value) {
            addCriterion("cltlimit <>", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitGreaterThan(Integer value) {
            addCriterion("cltlimit >", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cltlimit >=", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitLessThan(Integer value) {
            addCriterion("cltlimit <", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitLessThanOrEqualTo(Integer value) {
            addCriterion("cltlimit <=", value, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitIn(List<Integer> values) {
            addCriterion("cltlimit in", values, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitNotIn(List<Integer> values) {
            addCriterion("cltlimit not in", values, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitBetween(Integer value1, Integer value2) {
            addCriterion("cltlimit between", value1, value2, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("cltlimit not between", value1, value2, "cltlimit");
            return (Criteria) this;
        }

        public Criteria andCltcounselorIsNull() {
            addCriterion("cltcounselor is null");
            return (Criteria) this;
        }

        public Criteria andCltcounselorIsNotNull() {
            addCriterion("cltcounselor is not null");
            return (Criteria) this;
        }

        public Criteria andCltcounselorEqualTo(String value) {
            addCriterion("cltcounselor =", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorNotEqualTo(String value) {
            addCriterion("cltcounselor <>", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorGreaterThan(String value) {
            addCriterion("cltcounselor >", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorGreaterThanOrEqualTo(String value) {
            addCriterion("cltcounselor >=", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorLessThan(String value) {
            addCriterion("cltcounselor <", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorLessThanOrEqualTo(String value) {
            addCriterion("cltcounselor <=", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorLike(String value) {
            addCriterion("cltcounselor like", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorNotLike(String value) {
            addCriterion("cltcounselor not like", value, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorIn(List<String> values) {
            addCriterion("cltcounselor in", values, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorNotIn(List<String> values) {
            addCriterion("cltcounselor not in", values, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorBetween(String value1, String value2) {
            addCriterion("cltcounselor between", value1, value2, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcounselorNotBetween(String value1, String value2) {
            addCriterion("cltcounselor not between", value1, value2, "cltcounselor");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneIsNull() {
            addCriterion("cltcouphone is null");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneIsNotNull() {
            addCriterion("cltcouphone is not null");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneEqualTo(String value) {
            addCriterion("cltcouphone =", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneNotEqualTo(String value) {
            addCriterion("cltcouphone <>", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneGreaterThan(String value) {
            addCriterion("cltcouphone >", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cltcouphone >=", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneLessThan(String value) {
            addCriterion("cltcouphone <", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneLessThanOrEqualTo(String value) {
            addCriterion("cltcouphone <=", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneLike(String value) {
            addCriterion("cltcouphone like", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneNotLike(String value) {
            addCriterion("cltcouphone not like", value, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneIn(List<String> values) {
            addCriterion("cltcouphone in", values, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneNotIn(List<String> values) {
            addCriterion("cltcouphone not in", values, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneBetween(String value1, String value2) {
            addCriterion("cltcouphone between", value1, value2, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andCltcouphoneNotBetween(String value1, String value2) {
            addCriterion("cltcouphone not between", value1, value2, "cltcouphone");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("provinceid >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("provinceid <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("provinceid in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("provinceid not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNull() {
            addCriterion("districtid is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("districtid is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(Integer value) {
            addCriterion("districtid =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(Integer value) {
            addCriterion("districtid <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(Integer value) {
            addCriterion("districtid >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("districtid >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(Integer value) {
            addCriterion("districtid <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(Integer value) {
            addCriterion("districtid <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<Integer> values) {
            addCriterion("districtid in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<Integer> values) {
            addCriterion("districtid not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(Integer value1, Integer value2) {
            addCriterion("districtid between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(Integer value1, Integer value2) {
            addCriterion("districtid not between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andCltremakeIsNull() {
            addCriterion("cltremake is null");
            return (Criteria) this;
        }

        public Criteria andCltremakeIsNotNull() {
            addCriterion("cltremake is not null");
            return (Criteria) this;
        }

        public Criteria andCltremakeEqualTo(String value) {
            addCriterion("cltremake =", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeNotEqualTo(String value) {
            addCriterion("cltremake <>", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeGreaterThan(String value) {
            addCriterion("cltremake >", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeGreaterThanOrEqualTo(String value) {
            addCriterion("cltremake >=", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeLessThan(String value) {
            addCriterion("cltremake <", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeLessThanOrEqualTo(String value) {
            addCriterion("cltremake <=", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeLike(String value) {
            addCriterion("cltremake like", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeNotLike(String value) {
            addCriterion("cltremake not like", value, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeIn(List<String> values) {
            addCriterion("cltremake in", values, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeNotIn(List<String> values) {
            addCriterion("cltremake not in", values, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeBetween(String value1, String value2) {
            addCriterion("cltremake between", value1, value2, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltremakeNotBetween(String value1, String value2) {
            addCriterion("cltremake not between", value1, value2, "cltremake");
            return (Criteria) this;
        }

        public Criteria andCltdiscernIsNull() {
            addCriterion("cltdiscern is null");
            return (Criteria) this;
        }

        public Criteria andCltdiscernIsNotNull() {
            addCriterion("cltdiscern is not null");
            return (Criteria) this;
        }

        public Criteria andCltdiscernEqualTo(String value) {
            addCriterion("cltdiscern =", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernNotEqualTo(String value) {
            addCriterion("cltdiscern <>", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernGreaterThan(String value) {
            addCriterion("cltdiscern >", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernGreaterThanOrEqualTo(String value) {
            addCriterion("cltdiscern >=", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernLessThan(String value) {
            addCriterion("cltdiscern <", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernLessThanOrEqualTo(String value) {
            addCriterion("cltdiscern <=", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernLike(String value) {
            addCriterion("cltdiscern like", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernNotLike(String value) {
            addCriterion("cltdiscern not like", value, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernIn(List<String> values) {
            addCriterion("cltdiscern in", values, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernNotIn(List<String> values) {
            addCriterion("cltdiscern not in", values, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernBetween(String value1, String value2) {
            addCriterion("cltdiscern between", value1, value2, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltdiscernNotBetween(String value1, String value2) {
            addCriterion("cltdiscern not between", value1, value2, "cltdiscern");
            return (Criteria) this;
        }

        public Criteria andCltregisterIsNull() {
            addCriterion("cltregister is null");
            return (Criteria) this;
        }

        public Criteria andCltregisterIsNotNull() {
            addCriterion("cltregister is not null");
            return (Criteria) this;
        }

        public Criteria andCltregisterEqualTo(String value) {
            addCriterion("cltregister =", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterNotEqualTo(String value) {
            addCriterion("cltregister <>", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterGreaterThan(String value) {
            addCriterion("cltregister >", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterGreaterThanOrEqualTo(String value) {
            addCriterion("cltregister >=", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterLessThan(String value) {
            addCriterion("cltregister <", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterLessThanOrEqualTo(String value) {
            addCriterion("cltregister <=", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterLike(String value) {
            addCriterion("cltregister like", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterNotLike(String value) {
            addCriterion("cltregister not like", value, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterIn(List<String> values) {
            addCriterion("cltregister in", values, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterNotIn(List<String> values) {
            addCriterion("cltregister not in", values, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterBetween(String value1, String value2) {
            addCriterion("cltregister between", value1, value2, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltregisterNotBetween(String value1, String value2) {
            addCriterion("cltregister not between", value1, value2, "cltregister");
            return (Criteria) this;
        }

        public Criteria andCltaccountIsNull() {
            addCriterion("cltaccount is null");
            return (Criteria) this;
        }

        public Criteria andCltaccountIsNotNull() {
            addCriterion("cltaccount is not null");
            return (Criteria) this;
        }

        public Criteria andCltaccountEqualTo(String value) {
            addCriterion("cltaccount =", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountNotEqualTo(String value) {
            addCriterion("cltaccount <>", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountGreaterThan(String value) {
            addCriterion("cltaccount >", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountGreaterThanOrEqualTo(String value) {
            addCriterion("cltaccount >=", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountLessThan(String value) {
            addCriterion("cltaccount <", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountLessThanOrEqualTo(String value) {
            addCriterion("cltaccount <=", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountLike(String value) {
            addCriterion("cltaccount like", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountNotLike(String value) {
            addCriterion("cltaccount not like", value, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountIn(List<String> values) {
            addCriterion("cltaccount in", values, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountNotIn(List<String> values) {
            addCriterion("cltaccount not in", values, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountBetween(String value1, String value2) {
            addCriterion("cltaccount between", value1, value2, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltaccountNotBetween(String value1, String value2) {
            addCriterion("cltaccount not between", value1, value2, "cltaccount");
            return (Criteria) this;
        }

        public Criteria andCltregisteredIsNull() {
            addCriterion("cltregistered is null");
            return (Criteria) this;
        }

        public Criteria andCltregisteredIsNotNull() {
            addCriterion("cltregistered is not null");
            return (Criteria) this;
        }

        public Criteria andCltregisteredEqualTo(String value) {
            addCriterion("cltregistered =", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredNotEqualTo(String value) {
            addCriterion("cltregistered <>", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredGreaterThan(String value) {
            addCriterion("cltregistered >", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredGreaterThanOrEqualTo(String value) {
            addCriterion("cltregistered >=", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredLessThan(String value) {
            addCriterion("cltregistered <", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredLessThanOrEqualTo(String value) {
            addCriterion("cltregistered <=", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredLike(String value) {
            addCriterion("cltregistered like", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredNotLike(String value) {
            addCriterion("cltregistered not like", value, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredIn(List<String> values) {
            addCriterion("cltregistered in", values, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredNotIn(List<String> values) {
            addCriterion("cltregistered not in", values, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredBetween(String value1, String value2) {
            addCriterion("cltregistered between", value1, value2, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltregisteredNotBetween(String value1, String value2) {
            addCriterion("cltregistered not between", value1, value2, "cltregistered");
            return (Criteria) this;
        }

        public Criteria andCltconaddressIsNull() {
            addCriterion("cltconaddress is null");
            return (Criteria) this;
        }

        public Criteria andCltconaddressIsNotNull() {
            addCriterion("cltconaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCltconaddressEqualTo(String value) {
            addCriterion("cltconaddress =", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressNotEqualTo(String value) {
            addCriterion("cltconaddress <>", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressGreaterThan(String value) {
            addCriterion("cltconaddress >", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cltconaddress >=", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressLessThan(String value) {
            addCriterion("cltconaddress <", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressLessThanOrEqualTo(String value) {
            addCriterion("cltconaddress <=", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressLike(String value) {
            addCriterion("cltconaddress like", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressNotLike(String value) {
            addCriterion("cltconaddress not like", value, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressIn(List<String> values) {
            addCriterion("cltconaddress in", values, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressNotIn(List<String> values) {
            addCriterion("cltconaddress not in", values, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressBetween(String value1, String value2) {
            addCriterion("cltconaddress between", value1, value2, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltconaddressNotBetween(String value1, String value2) {
            addCriterion("cltconaddress not between", value1, value2, "cltconaddress");
            return (Criteria) this;
        }

        public Criteria andCltelseIsNull() {
            addCriterion("cltelse is null");
            return (Criteria) this;
        }

        public Criteria andCltelseIsNotNull() {
            addCriterion("cltelse is not null");
            return (Criteria) this;
        }

        public Criteria andCltelseEqualTo(String value) {
            addCriterion("cltelse =", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseNotEqualTo(String value) {
            addCriterion("cltelse <>", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseGreaterThan(String value) {
            addCriterion("cltelse >", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseGreaterThanOrEqualTo(String value) {
            addCriterion("cltelse >=", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseLessThan(String value) {
            addCriterion("cltelse <", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseLessThanOrEqualTo(String value) {
            addCriterion("cltelse <=", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseLike(String value) {
            addCriterion("cltelse like", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseNotLike(String value) {
            addCriterion("cltelse not like", value, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseIn(List<String> values) {
            addCriterion("cltelse in", values, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseNotIn(List<String> values) {
            addCriterion("cltelse not in", values, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseBetween(String value1, String value2) {
            addCriterion("cltelse between", value1, value2, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelseNotBetween(String value1, String value2) {
            addCriterion("cltelse not between", value1, value2, "cltelse");
            return (Criteria) this;
        }

        public Criteria andCltelsesIsNull() {
            addCriterion("cltelses is null");
            return (Criteria) this;
        }

        public Criteria andCltelsesIsNotNull() {
            addCriterion("cltelses is not null");
            return (Criteria) this;
        }

        public Criteria andCltelsesEqualTo(String value) {
            addCriterion("cltelses =", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesNotEqualTo(String value) {
            addCriterion("cltelses <>", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesGreaterThan(String value) {
            addCriterion("cltelses >", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesGreaterThanOrEqualTo(String value) {
            addCriterion("cltelses >=", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesLessThan(String value) {
            addCriterion("cltelses <", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesLessThanOrEqualTo(String value) {
            addCriterion("cltelses <=", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesLike(String value) {
            addCriterion("cltelses like", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesNotLike(String value) {
            addCriterion("cltelses not like", value, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesIn(List<String> values) {
            addCriterion("cltelses in", values, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesNotIn(List<String> values) {
            addCriterion("cltelses not in", values, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesBetween(String value1, String value2) {
            addCriterion("cltelses between", value1, value2, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsesNotBetween(String value1, String value2) {
            addCriterion("cltelses not between", value1, value2, "cltelses");
            return (Criteria) this;
        }

        public Criteria andCltelsessIsNull() {
            addCriterion("cltelsess is null");
            return (Criteria) this;
        }

        public Criteria andCltelsessIsNotNull() {
            addCriterion("cltelsess is not null");
            return (Criteria) this;
        }

        public Criteria andCltelsessEqualTo(String value) {
            addCriterion("cltelsess =", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessNotEqualTo(String value) {
            addCriterion("cltelsess <>", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessGreaterThan(String value) {
            addCriterion("cltelsess >", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessGreaterThanOrEqualTo(String value) {
            addCriterion("cltelsess >=", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessLessThan(String value) {
            addCriterion("cltelsess <", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessLessThanOrEqualTo(String value) {
            addCriterion("cltelsess <=", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessLike(String value) {
            addCriterion("cltelsess like", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessNotLike(String value) {
            addCriterion("cltelsess not like", value, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessIn(List<String> values) {
            addCriterion("cltelsess in", values, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessNotIn(List<String> values) {
            addCriterion("cltelsess not in", values, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessBetween(String value1, String value2) {
            addCriterion("cltelsess between", value1, value2, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsessNotBetween(String value1, String value2) {
            addCriterion("cltelsess not between", value1, value2, "cltelsess");
            return (Criteria) this;
        }

        public Criteria andCltelsesssIsNull() {
            addCriterion("cltelsesss is null");
            return (Criteria) this;
        }

        public Criteria andCltelsesssIsNotNull() {
            addCriterion("cltelsesss is not null");
            return (Criteria) this;
        }

        public Criteria andCltelsesssEqualTo(String value) {
            addCriterion("cltelsesss =", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssNotEqualTo(String value) {
            addCriterion("cltelsesss <>", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssGreaterThan(String value) {
            addCriterion("cltelsesss >", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssGreaterThanOrEqualTo(String value) {
            addCriterion("cltelsesss >=", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssLessThan(String value) {
            addCriterion("cltelsesss <", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssLessThanOrEqualTo(String value) {
            addCriterion("cltelsesss <=", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssLike(String value) {
            addCriterion("cltelsesss like", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssNotLike(String value) {
            addCriterion("cltelsesss not like", value, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssIn(List<String> values) {
            addCriterion("cltelsesss in", values, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssNotIn(List<String> values) {
            addCriterion("cltelsesss not in", values, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssBetween(String value1, String value2) {
            addCriterion("cltelsesss between", value1, value2, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andCltelsesssNotBetween(String value1, String value2) {
            addCriterion("cltelsesss not between", value1, value2, "cltelsesss");
            return (Criteria) this;
        }

        public Criteria andMe2beridIsNull() {
            addCriterion("me2berid is null");
            return (Criteria) this;
        }

        public Criteria andMe2beridIsNotNull() {
            addCriterion("me2berid is not null");
            return (Criteria) this;
        }

        public Criteria andMe2beridEqualTo(Integer value) {
            addCriterion("me2berid =", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotEqualTo(Integer value) {
            addCriterion("me2berid <>", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThan(Integer value) {
            addCriterion("me2berid >", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThanOrEqualTo(Integer value) {
            addCriterion("me2berid >=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThan(Integer value) {
            addCriterion("me2berid <", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThanOrEqualTo(Integer value) {
            addCriterion("me2berid <=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridIn(List<Integer> values) {
            addCriterion("me2berid in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotIn(List<Integer> values) {
            addCriterion("me2berid not in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridBetween(Integer value1, Integer value2) {
            addCriterion("me2berid between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotBetween(Integer value1, Integer value2) {
            addCriterion("me2berid not between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(Integer value) {
            addCriterion("keyid =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(Integer value) {
            addCriterion("keyid <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(Integer value) {
            addCriterion("keyid >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keyid >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(Integer value) {
            addCriterion("keyid <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(Integer value) {
            addCriterion("keyid <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<Integer> values) {
            addCriterion("keyid in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<Integer> values) {
            addCriterion("keyid not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(Integer value1, Integer value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(Integer value1, Integer value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andRes1IsNull() {
            addCriterion("res1 is null");
            return (Criteria) this;
        }

        public Criteria andRes1IsNotNull() {
            addCriterion("res1 is not null");
            return (Criteria) this;
        }

        public Criteria andRes1EqualTo(String value) {
            addCriterion("res1 =", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotEqualTo(String value) {
            addCriterion("res1 <>", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThan(String value) {
            addCriterion("res1 >", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThanOrEqualTo(String value) {
            addCriterion("res1 >=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThan(String value) {
            addCriterion("res1 <", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThanOrEqualTo(String value) {
            addCriterion("res1 <=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Like(String value) {
            addCriterion("res1 like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotLike(String value) {
            addCriterion("res1 not like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1In(List<String> values) {
            addCriterion("res1 in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotIn(List<String> values) {
            addCriterion("res1 not in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Between(String value1, String value2) {
            addCriterion("res1 between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotBetween(String value1, String value2) {
            addCriterion("res1 not between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes2IsNull() {
            addCriterion("res2 is null");
            return (Criteria) this;
        }

        public Criteria andRes2IsNotNull() {
            addCriterion("res2 is not null");
            return (Criteria) this;
        }

        public Criteria andRes2EqualTo(String value) {
            addCriterion("res2 =", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotEqualTo(String value) {
            addCriterion("res2 <>", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThan(String value) {
            addCriterion("res2 >", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThanOrEqualTo(String value) {
            addCriterion("res2 >=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThan(String value) {
            addCriterion("res2 <", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThanOrEqualTo(String value) {
            addCriterion("res2 <=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Like(String value) {
            addCriterion("res2 like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotLike(String value) {
            addCriterion("res2 not like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2In(List<String> values) {
            addCriterion("res2 in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotIn(List<String> values) {
            addCriterion("res2 not in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Between(String value1, String value2) {
            addCriterion("res2 between", value1, value2, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotBetween(String value1, String value2) {
            addCriterion("res2 not between", value1, value2, "res2");
            return (Criteria) this;
        }

        public Criteria andRes3IsNull() {
            addCriterion("res3 is null");
            return (Criteria) this;
        }

        public Criteria andRes3IsNotNull() {
            addCriterion("res3 is not null");
            return (Criteria) this;
        }

        public Criteria andRes3EqualTo(String value) {
            addCriterion("res3 =", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotEqualTo(String value) {
            addCriterion("res3 <>", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3GreaterThan(String value) {
            addCriterion("res3 >", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3GreaterThanOrEqualTo(String value) {
            addCriterion("res3 >=", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3LessThan(String value) {
            addCriterion("res3 <", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3LessThanOrEqualTo(String value) {
            addCriterion("res3 <=", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3Like(String value) {
            addCriterion("res3 like", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotLike(String value) {
            addCriterion("res3 not like", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3In(List<String> values) {
            addCriterion("res3 in", values, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotIn(List<String> values) {
            addCriterion("res3 not in", values, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3Between(String value1, String value2) {
            addCriterion("res3 between", value1, value2, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotBetween(String value1, String value2) {
            addCriterion("res3 not between", value1, value2, "res3");
            return (Criteria) this;
        }

        public Criteria andRes4IsNull() {
            addCriterion("res4 is null");
            return (Criteria) this;
        }

        public Criteria andRes4IsNotNull() {
            addCriterion("res4 is not null");
            return (Criteria) this;
        }

        public Criteria andRes4EqualTo(String value) {
            addCriterion("res4 =", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotEqualTo(String value) {
            addCriterion("res4 <>", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4GreaterThan(String value) {
            addCriterion("res4 >", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4GreaterThanOrEqualTo(String value) {
            addCriterion("res4 >=", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4LessThan(String value) {
            addCriterion("res4 <", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4LessThanOrEqualTo(String value) {
            addCriterion("res4 <=", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4Like(String value) {
            addCriterion("res4 like", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotLike(String value) {
            addCriterion("res4 not like", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4In(List<String> values) {
            addCriterion("res4 in", values, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotIn(List<String> values) {
            addCriterion("res4 not in", values, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4Between(String value1, String value2) {
            addCriterion("res4 between", value1, value2, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotBetween(String value1, String value2) {
            addCriterion("res4 not between", value1, value2, "res4");
            return (Criteria) this;
        }

        public Criteria andRes5IsNull() {
            addCriterion("res5 is null");
            return (Criteria) this;
        }

        public Criteria andRes5IsNotNull() {
            addCriterion("res5 is not null");
            return (Criteria) this;
        }

        public Criteria andRes5EqualTo(Integer value) {
            addCriterion("res5 =", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5NotEqualTo(Integer value) {
            addCriterion("res5 <>", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5GreaterThan(Integer value) {
            addCriterion("res5 >", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5GreaterThanOrEqualTo(Integer value) {
            addCriterion("res5 >=", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5LessThan(Integer value) {
            addCriterion("res5 <", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5LessThanOrEqualTo(Integer value) {
            addCriterion("res5 <=", value, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5In(List<Integer> values) {
            addCriterion("res5 in", values, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5NotIn(List<Integer> values) {
            addCriterion("res5 not in", values, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5Between(Integer value1, Integer value2) {
            addCriterion("res5 between", value1, value2, "res5");
            return (Criteria) this;
        }

        public Criteria andRes5NotBetween(Integer value1, Integer value2) {
            addCriterion("res5 not between", value1, value2, "res5");
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