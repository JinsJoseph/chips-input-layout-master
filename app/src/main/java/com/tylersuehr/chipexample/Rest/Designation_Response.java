package com.tylersuehr.chipexample.Rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 12/16/2017.
 */

public class Designation_Response {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Designation {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("designation_name")
        @Expose
        private String designationName;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDesignationName() {
            return designationName;
        }

        public void setDesignationName(String designationName) {
            this.designationName = designationName;
        }

    }


    public class Data {

        @SerializedName("designations")
        @Expose
        private List<Designation> designations = new ArrayList<Designation>();
        @SerializedName("cities")
        @Expose
        private List<City> cities = new ArrayList<City>();

        public List<Designation> getDesignations() {
            return designations;
        }

        public void setDesignations(List<Designation> designations) {
            this.designations = designations;
        }

        public List<City> getCities() {
            return cities;
        }

        public void setCities(List<City> cities) {
            this.cities = cities;
        }

    }


    public class City {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("state_id")
        @Expose
        private Integer stateId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Integer getStateId() {
            return stateId;
        }

        public void setStateId(Integer stateId) {
            this.stateId = stateId;
        }

    }

}