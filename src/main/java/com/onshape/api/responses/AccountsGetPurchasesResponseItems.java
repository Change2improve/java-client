// The MIT License (MIT)
//
// Copyright (c) 2018 - Present Onshape Inc. 
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getPurchases API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AccountsGetPurchasesResponseItems {
  /**
   * Purchase Id
   */
  @JsonProperty("id")
  public String id;

  /**
   * User Ids
   */
  @JsonProperty("userIds")
  public String[] userIds;

  /**
   * Consumed Ids
   */
  @JsonProperty("consumedIds")
  public String[] consumedIds;

  /**
   * Number of seats
   */
  @JsonProperty("seats")
  public Number seats;

  /**
   * Account id
   */
  @JsonProperty("accountId")
  public String accountId;

  /**
   * Plan id
   */
  @JsonProperty("planId")
  public String planId;

  /**
   * Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   */
  @JsonProperty("planType")
  public Number planType;

  /**
   * Plan name
   */
  @JsonProperty("planName")
  public String planName;

  /**
   * Group
   */
  @JsonProperty("group")
  public String group;

  /**
   * Application Id
   */
  @JsonProperty("applicationId")
  public String applicationId;

  /**
   * Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   */
  @JsonProperty("state")
  public Number state;

  /**
   * Purchase canceled at
   */
  @JsonProperty("canceledAt")
  public String canceledAt;

  /**
   * Subscription end at
   */
  @JsonProperty("subscriptionEndAt")
  public String subscriptionEndAt;

  /**
   * Amount cents
   */
  @JsonProperty("amountCents")
  public Number amountCents;

  /**
   * Card information
   */
  @JsonProperty("card")
  public AccountsGetPurchasesResponseItemsCard card;

  /**
   * Get Purchase Id
   *
   * @return Purchase Id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get User Ids
   *
   * @return User Ids
   *
   */
  public final String[] getUserIds() {
    return this.userIds;
  }

  /**
   * Get Consumed Ids
   *
   * @return Consumed Ids
   *
   */
  public final String[] getConsumedIds() {
    return this.consumedIds;
  }

  /**
   * Get Number of seats
   *
   * @return Number of seats
   *
   */
  public final Number getSeats() {
    return this.seats;
  }

  /**
   * Get Account id
   *
   * @return Account id
   *
   */
  public final String getAccountId() {
    return this.accountId;
  }

  /**
   * Get Plan id
   *
   * @return Plan id
   *
   */
  public final String getPlanId() {
    return this.planId;
  }

  /**
   * Get Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   * @return Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   */
  public final Number getPlanType() {
    return this.planType;
  }

  /**
   * Get Plan name
   *
   * @return Plan name
   *
   */
  public final String getPlanName() {
    return this.planName;
  }

  /**
   * Get Group
   *
   * @return Group
   *
   */
  public final String getGroup() {
    return this.group;
  }

  /**
   * Get Application Id
   *
   * @return Application Id
   *
   */
  public final String getApplicationId() {
    return this.applicationId;
  }

  /**
   * Get Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   *
   * @return Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   *
   */
  public final Number getState() {
    return this.state;
  }

  /**
   * Get Purchase canceled at
   *
   * @return Purchase canceled at
   *
   */
  public final String getCanceledAt() {
    return this.canceledAt;
  }

  /**
   * Get Subscription end at
   *
   * @return Subscription end at
   *
   */
  public final String getSubscriptionEndAt() {
    return this.subscriptionEndAt;
  }

  /**
   * Get Amount cents
   *
   * @return Amount cents
   *
   */
  public final Number getAmountCents() {
    return this.amountCents;
  }

  /**
   * Get Card information
   *
   * @return Card information
   *
   */
  public final AccountsGetPurchasesResponseItemsCard getCard() {
    return this.card;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
