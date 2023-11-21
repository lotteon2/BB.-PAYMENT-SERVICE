package kr.bb.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import kr.bb.payment.entity.common.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Payment extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_id")
  private Long paymentId;

  @Column(name = "user_id", unique = true, nullable = false)
  private Long userId;

  @Column(name = "order_id", unique = true, nullable = false)
  private Long orderId;

  @Enumerated(EnumType.STRING)
  @Column(name = "orderType", nullable = false)
  private String orderType;

  @Column(name = "payment_cid", nullable = false)
  private String paymentCid;

  @Column(name = "payment_tid", nullable = false)
  private String paymentTid;

  @Column(name = "payment_actual_amount", nullable = false)
  private String paymentActualAmount;

  @Column(name = "payment_type", nullable = false)
  private String paymentType;

  @Column(name = "payment_status", nullable = false)
  private String paymentStatus;
}
