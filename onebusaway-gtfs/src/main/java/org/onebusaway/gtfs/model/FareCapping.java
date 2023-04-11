/**
 * Copyright (C) 2023 Viljami Nurminen <viljami.nurminen@cgi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.gtfs.model;

import org.onebusaway.csv_entities.schema.annotations.CsvField;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;
import org.onebusaway.gtfs.serialization.mappings.DefaultAgencyIdFieldMappingFactory;
import org.onebusaway.gtfs.serialization.mappings.EntityFieldMappingFactory;
import org.onebusaway.gtfs.serialization.mappings.FareProductFieldMappingFactory;


@CsvFields(filename = "fare_capping.txt", required = false)
public final class FareCapping {

    @CsvField(name = "fare_product_id", mapping = FareProductFieldMappingFactory.class)
    private FareProduct fareProductId;

    @CsvField(name = "eligible_cap_id", mapping = FareProductFieldMappingFactory.class)
    private FareProduct eligibleCapId;

    @CsvField(name= "fare_media_id", mapping = EntityFieldMappingFactory.class)
    private FareContainer media;

    @CsvField(name= "duration_amount")
    private Integer durationAmount;

    @CsvField(name="duration_unit")
    private Integer durationUnit;

    @CsvField(name ="duration_type")
    private Integer durationType;

    @CsvField(name="offset_amount")
    private Integer offsetAmount;

    @CsvField(name = "offset_unit")
    private Integer offsetUnit;

    @CsvField(name = "service_id", optional = true)
    private AgencyAndId serviceId;

    @CsvField(name="timeframe_id", optional = true, mapping= EntityFieldMappingFactory.class)
    private Timeframe timeframe;

    @CsvField(name = "area_id", optional = true)
    private String areaId;

    @CsvField(name = "network_id", optional = true)
    private String networkId;

    @CsvField(name="cap_amount")
    private float capAmount;

    @CsvField(name ="currency")
    private String currency;

    public FareProduct getFareProductId() {
        return fareProductId;
    }

    public void setFareProductId(FareProduct id) {
        this.fareProductId = id;
    }

    public FareProduct getEligibleCapId() {
        return eligibleCapId;
    }

    public void setEligibleCapId(FareProduct eligibleCapId) {
        this.eligibleCapId = eligibleCapId;
    }

    public FareContainer getMedia() {
        return media;
    }

    public void setMedia(FareContainer media) {
        this.media = media;
    }

    public void setDurationAmount(Integer durationAmount) {
        this.durationAmount = durationAmount;
    }

    public Integer getDurationAmount() {
        return durationAmount;
    }

    public Integer getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(Integer durationUnit) {
        this.durationUnit = durationUnit;
    }

    public void setDurationType(Integer durationType) {
        this.durationType = durationType;
    }

    public Integer getDurationType() {
        return durationType;
    }

    public void setOffsetAmount(Integer offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    public Integer getOffsetAmount() {
        return offsetAmount;
    }

    public void setOffsetUnit(Integer offsetUnit) {
        this.offsetUnit = offsetUnit;
    }

    public Integer getOffsetUnit() {
        return offsetUnit;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public Timeframe getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(Timeframe timeframe) {
        this.timeframe = timeframe;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public AgencyAndId getServiceId() {
        return serviceId;
    }

    public void setServiceId(AgencyAndId serviceId) {
        this.serviceId = serviceId;
    }

    public float getCapAmount() {
        return capAmount;
    }

    public void setCapAmount(float capAmount) {
        this.capAmount = capAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
