package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KeclassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeclassifyExample() {
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

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("keyid =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("keyid <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("keyid >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("keyid >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("keyid <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("keyid <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("keyid like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("keyid not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("keyid in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("keyid not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyketypeIsNull() {
            addCriterion("keyketype is null");
            return (Criteria) this;
        }

        public Criteria andKeyketypeIsNotNull() {
            addCriterion("keyketype is not null");
            return (Criteria) this;
        }

        public Criteria andKeyketypeEqualTo(String value) {
            addCriterion("keyketype =", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeNotEqualTo(String value) {
            addCriterion("keyketype <>", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeGreaterThan(String value) {
            addCriterion("keyketype >", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeGreaterThanOrEqualTo(String value) {
            addCriterion("keyketype >=", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeLessThan(String value) {
            addCriterion("keyketype <", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeLessThanOrEqualTo(String value) {
            addCriterion("keyketype <=", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeLike(String value) {
            addCriterion("keyketype like", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeNotLike(String value) {
            addCriterion("keyketype not like", value, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeIn(List<String> values) {
            addCriterion("keyketype in", values, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeNotIn(List<String> values) {
            addCriterion("keyketype not in", values, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeBetween(String value1, String value2) {
            addCriterion("keyketype between", value1, value2, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeyketypeNotBetween(String value1, String value2) {
            addCriterion("keyketype not between", value1, value2, "keyketype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeIsNull() {
            addCriterion("keypricetype is null");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeIsNotNull() {
            addCriterion("keypricetype is not null");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeEqualTo(String value) {
            addCriterion("keypricetype =", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeNotEqualTo(String value) {
            addCriterion("keypricetype <>", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeGreaterThan(String value) {
            addCriterion("keypricetype >", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("keypricetype >=", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeLessThan(String value) {
            addCriterion("keypricetype <", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeLessThanOrEqualTo(String value) {
            addCriterion("keypricetype <=", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeLike(String value) {
            addCriterion("keypricetype like", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeNotLike(String value) {
            addCriterion("keypricetype not like", value, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeIn(List<String> values) {
            addCriterion("keypricetype in", values, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeNotIn(List<String> values) {
            addCriterion("keypricetype not in", values, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeBetween(String value1, String value2) {
            addCriterion("keypricetype between", value1, value2, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeypricetypeNotBetween(String value1, String value2) {
            addCriterion("keypricetype not between", value1, value2, "keypricetype");
            return (Criteria) this;
        }

        public Criteria andKeyyxqIsNull() {
            addCriterion("keyyxq is null");
            return (Criteria) this;
        }

        public Criteria andKeyyxqIsNotNull() {
            addCriterion("keyyxq is not null");
            return (Criteria) this;
        }

        public Criteria andKeyyxqEqualTo(String value) {
            addCriterion("keyyxq =", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqNotEqualTo(String value) {
            addCriterion("keyyxq <>", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqGreaterThan(String value) {
            addCriterion("keyyxq >", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqGreaterThanOrEqualTo(String value) {
            addCriterion("keyyxq >=", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqLessThan(String value) {
            addCriterion("keyyxq <", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqLessThanOrEqualTo(String value) {
            addCriterion("keyyxq <=", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqLike(String value) {
            addCriterion("keyyxq like", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqNotLike(String value) {
            addCriterion("keyyxq not like", value, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqIn(List<String> values) {
            addCriterion("keyyxq in", values, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqNotIn(List<String> values) {
            addCriterion("keyyxq not in", values, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqBetween(String value1, String value2) {
            addCriterion("keyyxq between", value1, value2, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyyxqNotBetween(String value1, String value2) {
            addCriterion("keyyxq not between", value1, value2, "keyyxq");
            return (Criteria) this;
        }

        public Criteria andKeyhfIsNull() {
            addCriterion("keyhf is null");
            return (Criteria) this;
        }

        public Criteria andKeyhfIsNotNull() {
            addCriterion("keyhf is not null");
            return (Criteria) this;
        }

        public Criteria andKeyhfEqualTo(Integer value) {
            addCriterion("keyhf =", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfNotEqualTo(Integer value) {
            addCriterion("keyhf <>", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfGreaterThan(Integer value) {
            addCriterion("keyhf >", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfGreaterThanOrEqualTo(Integer value) {
            addCriterion("keyhf >=", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfLessThan(Integer value) {
            addCriterion("keyhf <", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfLessThanOrEqualTo(Integer value) {
            addCriterion("keyhf <=", value, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfIn(List<Integer> values) {
            addCriterion("keyhf in", values, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfNotIn(List<Integer> values) {
            addCriterion("keyhf not in", values, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfBetween(Integer value1, Integer value2) {
            addCriterion("keyhf between", value1, value2, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeyhfNotBetween(Integer value1, Integer value2) {
            addCriterion("keyhf not between", value1, value2, "keyhf");
            return (Criteria) this;
        }

        public Criteria andKeytypeIsNull() {
            addCriterion("keytype is null");
            return (Criteria) this;
        }

        public Criteria andKeytypeIsNotNull() {
            addCriterion("keytype is not null");
            return (Criteria) this;
        }

        public Criteria andKeytypeEqualTo(String value) {
            addCriterion("keytype =", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeNotEqualTo(String value) {
            addCriterion("keytype <>", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeGreaterThan(String value) {
            addCriterion("keytype >", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeGreaterThanOrEqualTo(String value) {
            addCriterion("keytype >=", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeLessThan(String value) {
            addCriterion("keytype <", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeLessThanOrEqualTo(String value) {
            addCriterion("keytype <=", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeLike(String value) {
            addCriterion("keytype like", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeNotLike(String value) {
            addCriterion("keytype not like", value, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeIn(List<String> values) {
            addCriterion("keytype in", values, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeNotIn(List<String> values) {
            addCriterion("keytype not in", values, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeBetween(String value1, String value2) {
            addCriterion("keytype between", value1, value2, "keytype");
            return (Criteria) this;
        }

        public Criteria andKeytypeNotBetween(String value1, String value2) {
            addCriterion("keytype not between", value1, value2, "keytype");
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