package com.qiu.pojo;

import java.util.ArrayList;
import java.util.List;

public class unified_code_Audio_RelationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public unified_code_Audio_RelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
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

        public Criteria andCodingIdIsNull() {
            addCriterion("coding_id is null");
            return (Criteria) this;
        }

        public Criteria andCodingIdIsNotNull() {
            addCriterion("coding_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodingIdEqualTo(Integer value) {
            addCriterion("coding_id =", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdNotEqualTo(Integer value) {
            addCriterion("coding_id <>", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdGreaterThan(Integer value) {
            addCriterion("coding_id >", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coding_id >=", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdLessThan(Integer value) {
            addCriterion("coding_id <", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdLessThanOrEqualTo(Integer value) {
            addCriterion("coding_id <=", value, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdIn(List<Integer> values) {
            addCriterion("coding_id in", values, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdNotIn(List<Integer> values) {
            addCriterion("coding_id not in", values, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdBetween(Integer value1, Integer value2) {
            addCriterion("coding_id between", value1, value2, "codingId");
            return (Criteria) this;
        }

        public Criteria andCodingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coding_id not between", value1, value2, "codingId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNull() {
            addCriterion("audio_id is null");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNotNull() {
            addCriterion("audio_id is not null");
            return (Criteria) this;
        }

        public Criteria andAudioIdEqualTo(Integer value) {
            addCriterion("audio_id =", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotEqualTo(Integer value) {
            addCriterion("audio_id <>", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThan(Integer value) {
            addCriterion("audio_id >", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audio_id >=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThan(Integer value) {
            addCriterion("audio_id <", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThanOrEqualTo(Integer value) {
            addCriterion("audio_id <=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIn(List<Integer> values) {
            addCriterion("audio_id in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotIn(List<Integer> values) {
            addCriterion("audio_id not in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdBetween(Integer value1, Integer value2) {
            addCriterion("audio_id between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audio_id not between", value1, value2, "audioId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated do_not_delete_during_merge Sat Nov 25 20:04:19 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
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