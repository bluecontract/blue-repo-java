package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.finoscdm60d07.Account;
import blue.repo.finoscdm60d07.AccountTypeEnum;
import blue.repo.finoscdm60d07.AcctOwnr;
import blue.repo.finoscdm60d07.ActionEnum;
import blue.repo.finoscdm60d07.AdditionalDisruptionEvents;
import blue.repo.finoscdm60d07.AdditionalFixedPayments;
import blue.repo.finoscdm60d07.Address;
import blue.repo.finoscdm60d07.AddressForNotices;
import blue.repo.finoscdm60d07.AddtlAttrbts;
import blue.repo.finoscdm60d07.AdjustableDate;
import blue.repo.finoscdm60d07.AdjustableDates;
import blue.repo.finoscdm60d07.AdjustableOrAdjustedDate;
import blue.repo.finoscdm60d07.AdjustableOrAdjustedOrRelativeDate;
import blue.repo.finoscdm60d07.AdjustableOrRelativeDate;
import blue.repo.finoscdm60d07.AdjustableOrRelativeDates;
import blue.repo.finoscdm60d07.AdjustableRelativeOrPeriodicDates;
import blue.repo.finoscdm60d07.AdjustedRelativeDateOffset;
import blue.repo.finoscdm60d07.AffirmationStatusEnum;
import blue.repo.finoscdm60d07.AgencyRatingCriteria;
import blue.repo.finoscdm60d07.AggregationParameters;
import blue.repo.finoscdm60d07.Agreement;
import blue.repo.finoscdm60d07.AgreementName;
import blue.repo.finoscdm60d07.AgreementTerms;
import blue.repo.finoscdm60d07.AllCriteria;
import blue.repo.finoscdm60d07.AlternativeToInterestAmountEnum;
import blue.repo.finoscdm60d07.AmountSchedule;
import blue.repo.finoscdm60d07.AncillaryEntity;
import blue.repo.finoscdm60d07.AncillaryParty;
import blue.repo.finoscdm60d07.AncillaryRoleEnum;
import blue.repo.finoscdm60d07.AnyCriteria;
import blue.repo.finoscdm60d07.ArithmeticOperationEnum;
import blue.repo.finoscdm60d07.Asian;
import blue.repo.finoscdm60d07.Asset;
import blue.repo.finoscdm60d07.AssetAgencyRating;
import blue.repo.finoscdm60d07.AssetBase;
import blue.repo.finoscdm60d07.AssetClassEnum;
import blue.repo.finoscdm60d07.AssetCountryOfOrigin;
import blue.repo.finoscdm60d07.AssetDeliveryInformation;
import blue.repo.finoscdm60d07.AssetDeliveryPeriods;
import blue.repo.finoscdm60d07.AssetDeliveryProfile;
import blue.repo.finoscdm60d07.AssetDeliveryProfileBlock;
import blue.repo.finoscdm60d07.AssetFlowBase;
import blue.repo.finoscdm60d07.AssetIdentifier;
import blue.repo.finoscdm60d07.AssetIdTypeEnum;
import blue.repo.finoscdm60d07.AssetLeg;
import blue.repo.finoscdm60d07.AssetMaturity;
import blue.repo.finoscdm60d07.AssetPayout;
import blue.repo.finoscdm60d07.AssetPayoutTradeTypeEnum;
import blue.repo.finoscdm60d07.AssetTransferTypeEnum;
import blue.repo.finoscdm60d07.AssetType;
import blue.repo.finoscdm60d07.AssetTypeEnum;
import blue.repo.finoscdm60d07.AssignedIdentifier;
import blue.repo.finoscdm60d07.AutomaticExercise;
import blue.repo.finoscdm60d07.AvailableInventory;
import blue.repo.finoscdm60d07.AvailableInventoryRecord;
import blue.repo.finoscdm60d07.AvailableInventoryTypeEnum;
import blue.repo.finoscdm60d07.AverageTradingVolume;
import blue.repo.finoscdm60d07.AverageTradingVolumeMethodologyEnum;
import blue.repo.finoscdm60d07.AveragingCalculation;
import blue.repo.finoscdm60d07.AveragingCalculationMethod;
import blue.repo.finoscdm60d07.AveragingCalculationMethodEnum;
import blue.repo.finoscdm60d07.AveragingInOutEnum;
import blue.repo.finoscdm60d07.AveragingObservationList;
import blue.repo.finoscdm60d07.AveragingPeriod;
import blue.repo.finoscdm60d07.AveragingSchedule;
import blue.repo.finoscdm60d07.AveragingStrikeFeature;
import blue.repo.finoscdm60d07.AveragingWeightingMethodEnum;
import blue.repo.finoscdm60d07.BankHolidayTreatmentEnum;
import blue.repo.finoscdm60d07.Barrier;
import blue.repo.finoscdm60d07.Basket;
import blue.repo.finoscdm60d07.BasketConstituent;
import blue.repo.finoscdm60d07.BasketReferenceInformation;
import blue.repo.finoscdm60d07.BillingInstruction;
import blue.repo.finoscdm60d07.BillingRecord;
import blue.repo.finoscdm60d07.BillingRecordInstruction;
import blue.repo.finoscdm60d07.BillingSummary;
import blue.repo.finoscdm60d07.BillingSummaryInstruction;
import blue.repo.finoscdm60d07.BondReference;
import blue.repo.finoscdm60d07.BoundedCorrelation;
import blue.repo.finoscdm60d07.BoundedVariance;
import blue.repo.finoscdm60d07.BusinessCenterEnum;
import blue.repo.finoscdm60d07.BusinessCenters;
import blue.repo.finoscdm60d07.BusinessCenterTime;
import blue.repo.finoscdm60d07.BusinessDateRange;
import blue.repo.finoscdm60d07.BusinessDayAdjustments;
import blue.repo.finoscdm60d07.BusinessDayConventionEnum;
import blue.repo.finoscdm60d07.BusinessEvent;
import blue.repo.finoscdm60d07.BusinessUnit;
import blue.repo.finoscdm60d07.BuyerSeller;
import blue.repo.finoscdm60d07.Buyr;
import blue.repo.finoscdm60d07.CalculatedRateDetails;
import blue.repo.finoscdm60d07.CalculatedRateObservationDatesAndWeights;
import blue.repo.finoscdm60d07.CalculatedRateObservations;
import blue.repo.finoscdm60d07.CalculateTransferInstruction;
import blue.repo.finoscdm60d07.CalculationAgent;
import blue.repo.finoscdm60d07.CalculationFrequency;
import blue.repo.finoscdm60d07.CalculationMethodEnum;
import blue.repo.finoscdm60d07.CalculationPeriod;
import blue.repo.finoscdm60d07.CalculationPeriodBase;
import blue.repo.finoscdm60d07.CalculationPeriodData;
import blue.repo.finoscdm60d07.CalculationPeriodDates;
import blue.repo.finoscdm60d07.CalculationPeriodFrequency;
import blue.repo.finoscdm60d07.CalculationSchedule;
import blue.repo.finoscdm60d07.CalculationScheduleDeliveryPeriods;
import blue.repo.finoscdm60d07.CalculationShiftMethodEnum;
import blue.repo.finoscdm60d07.CalendarSpread;
import blue.repo.finoscdm60d07.CallingPartyEnum;
import blue.repo.finoscdm60d07.CallTypeEnum;
import blue.repo.finoscdm60d07.CancelableProvision;
import blue.repo.finoscdm60d07.CancelableProvisionAdjustedDates;
import blue.repo.finoscdm60d07.CancellationEvent;
import blue.repo.finoscdm60d07.CapacityUnitEnum;
import blue.repo.finoscdm60d07.Cash;
import blue.repo.finoscdm60d07.CashCollateralValuationMethod;
import blue.repo.finoscdm60d07.Cashflow;
import blue.repo.finoscdm60d07.CashflowRepresentation;
import blue.repo.finoscdm60d07.CashflowType;
import blue.repo.finoscdm60d07.CashPrice;
import blue.repo.finoscdm60d07.CashPriceTypeEnum;
import blue.repo.finoscdm60d07.CashSettlementMethodEnum;
import blue.repo.finoscdm60d07.CashSettlementTerms;
import blue.repo.finoscdm60d07.CheckEligibilityResult;
import blue.repo.finoscdm60d07.Clause;
import blue.repo.finoscdm60d07.ClearingInstruction;
import blue.repo.finoscdm60d07.ClosedState;
import blue.repo.finoscdm60d07.ClosedStateEnum;
import blue.repo.finoscdm60d07.Collateral;
import blue.repo.finoscdm60d07.CollateralAgreementFloatingRate;
import blue.repo.finoscdm60d07.CollateralBalance;
import blue.repo.finoscdm60d07.CollateralCriteria;
import blue.repo.finoscdm60d07.CollateralCriteriaBase;
import blue.repo.finoscdm60d07.CollateralInterestCalculationParameters;
import blue.repo.finoscdm60d07.CollateralInterestHandlingEnum;
import blue.repo.finoscdm60d07.CollateralInterestHandlingParameters;
import blue.repo.finoscdm60d07.CollateralInterestNotification;
import blue.repo.finoscdm60d07.CollateralInterestParameters;
import blue.repo.finoscdm60d07.CollateralIssuerType;
import blue.repo.finoscdm60d07.CollateralMarginTypeEnum;
import blue.repo.finoscdm60d07.CollateralPortfolio;
import blue.repo.finoscdm60d07.CollateralPosition;
import blue.repo.finoscdm60d07.CollateralProvisions;
import blue.repo.finoscdm60d07.CollateralStatusEnum;
import blue.repo.finoscdm60d07.CollateralTaxonomy;
import blue.repo.finoscdm60d07.CollateralTaxonomyValue;
import blue.repo.finoscdm60d07.CollateralTransferAgreementElections;
import blue.repo.finoscdm60d07.CollateralTreatment;
import blue.repo.finoscdm60d07.CollateralTypeEnum;
import blue.repo.finoscdm60d07.CollateralValuationTreatment;
import blue.repo.finoscdm60d07.Commodity;
import blue.repo.finoscdm60d07.CommodityBusinessCalendarEnum;
import blue.repo.finoscdm60d07.CommodityInformationPublisherEnum;
import blue.repo.finoscdm60d07.CommodityLocationIdentifierTypeEnum;
import blue.repo.finoscdm60d07.CommodityPayout;
import blue.repo.finoscdm60d07.CommodityPriceReturnTerms;
import blue.repo.finoscdm60d07.CommodityProductDefinition;
import blue.repo.finoscdm60d07.CommodityReferenceFramework;
import blue.repo.finoscdm60d07.CommodityReferencePriceEnum;
import blue.repo.finoscdm60d07.CompareOp;
import blue.repo.finoscdm60d07.Composite;
import blue.repo.finoscdm60d07.CompoundingMethodEnum;
import blue.repo.finoscdm60d07.CompoundingTypeEnum;
import blue.repo.finoscdm60d07.ComputedAmount;
import blue.repo.finoscdm60d07.ConcentrationLimit;
import blue.repo.finoscdm60d07.ConcentrationLimitCriteria;
import blue.repo.finoscdm60d07.ConcentrationLimitTypeEnum;
import blue.repo.finoscdm60d07.ConfirmationStatusEnum;
import blue.repo.finoscdm60d07.ConstituentWeight;
import blue.repo.finoscdm60d07.ContactElection;
import blue.repo.finoscdm60d07.ContactInformation;
import blue.repo.finoscdm60d07.ContractBase;
import blue.repo.finoscdm60d07.ContractDetails;
import blue.repo.finoscdm60d07.ContractFormationInstruction;
import blue.repo.finoscdm60d07.ContractualDefinitionsEnum;
import blue.repo.finoscdm60d07.ContractualMatrix;
import blue.repo.finoscdm60d07.ContractualSupplementTypeEnum;
import blue.repo.finoscdm60d07.ContractualTermsSupplement;
import blue.repo.finoscdm60d07.CorporateAction;
import blue.repo.finoscdm60d07.CorporateActionTypeEnum;
import blue.repo.finoscdm60d07.CorrelationReturnTerms;
import blue.repo.finoscdm60d07.Counterparty;
import blue.repo.finoscdm60d07.CounterpartyOwnIssuePermitted;
import blue.repo.finoscdm60d07.CounterpartyPosition;
import blue.repo.finoscdm60d07.CounterpartyPositionBusinessEvent;
import blue.repo.finoscdm60d07.CounterpartyPositionState;
import blue.repo.finoscdm60d07.CounterpartyRoleEnum;
import blue.repo.finoscdm60d07.CreditDefaultPayout;
import blue.repo.finoscdm60d07.CreditEvent;
import blue.repo.finoscdm60d07.CreditEventNotice;
import blue.repo.finoscdm60d07.CreditEvents;
import blue.repo.finoscdm60d07.CreditEventTypeEnum;
import blue.repo.finoscdm60d07.CreditIndex;
import blue.repo.finoscdm60d07.CreditLimitInformation;
import blue.repo.finoscdm60d07.CreditLimitTypeEnum;
import blue.repo.finoscdm60d07.CreditLimitUtilisation;
import blue.repo.finoscdm60d07.CreditLimitUtilisationPosition;
import blue.repo.finoscdm60d07.CreditNotation;
import blue.repo.finoscdm60d07.CreditNotationBoundaryEnum;
import blue.repo.finoscdm60d07.CreditNotationMismatchResolutionEnum;
import blue.repo.finoscdm60d07.CreditNotations;
import blue.repo.finoscdm60d07.CreditRatingAgencyEnum;
import blue.repo.finoscdm60d07.CreditRatingCreditWatchEnum;
import blue.repo.finoscdm60d07.CreditRatingDebt;
import blue.repo.finoscdm60d07.CreditRatingOutlookEnum;
import blue.repo.finoscdm60d07.CreditRiskEnum;
import blue.repo.finoscdm60d07.CreditSeniorityEnum;
import blue.repo.finoscdm60d07.CreditSupportAgreementElections;
import blue.repo.finoscdm60d07.CreditSupportAgreementTypeEnum;
import blue.repo.finoscdm60d07.CreditSupportDocumentTermsEnum;
import blue.repo.finoscdm60d07.CreditSupportProviderTermsEnum;
import blue.repo.finoscdm60d07.CsaTypeEnum;
import blue.repo.finoscdm60d07.CurrencyCodeEnum;
import blue.repo.finoscdm60d07.Curve;
import blue.repo.finoscdm60d07.CustomisableOffset;
import blue.repo.finoscdm60d07.CustomisedWorkflow;
import blue.repo.finoscdm60d07.DatedValue;
import blue.repo.finoscdm60d07.DateList;
import blue.repo.finoscdm60d07.DateRange;
import blue.repo.finoscdm60d07.DateRelativeToCalculationPeriodDates;
import blue.repo.finoscdm60d07.DateRelativeToPaymentDates;
import blue.repo.finoscdm60d07.DateRelativeToValuationDates;
import blue.repo.finoscdm60d07.DateTimeList;
import blue.repo.finoscdm60d07.DayCountFractionEnum;
import blue.repo.finoscdm60d07.DayDistributionEnum;
import blue.repo.finoscdm60d07.DayOfWeekEnum;
import blue.repo.finoscdm60d07.DayTypeEnum;
import blue.repo.finoscdm60d07.DebtClassEnum;
import blue.repo.finoscdm60d07.DebtEconomics;
import blue.repo.finoscdm60d07.DebtInterestEnum;
import blue.repo.finoscdm60d07.DebtPrincipalEnum;
import blue.repo.finoscdm60d07.DebtSeniorityEnum;
import blue.repo.finoscdm60d07.DebtType;
import blue.repo.finoscdm60d07.DeliverableObligations;
import blue.repo.finoscdm60d07.DeliveryAmount;
import blue.repo.finoscdm60d07.DeliveryAmountElectionEnum;
import blue.repo.finoscdm60d07.DeliveryDateParameters;
import blue.repo.finoscdm60d07.DeliveryMethodEnum;
import blue.repo.finoscdm60d07.DeliveryNearbyTypeEnum;
import blue.repo.finoscdm60d07.DerivInstrmAttrbts;
import blue.repo.finoscdm60d07.DeterminationMethodEnum;
import blue.repo.finoscdm60d07.DeterminationMethodology;
import blue.repo.finoscdm60d07.DeterminationRolesAndTerms;
import blue.repo.finoscdm60d07.DigitalAsset;
import blue.repo.finoscdm60d07.DiscountingMethod;
import blue.repo.finoscdm60d07.DiscountingTypeEnum;
import blue.repo.finoscdm60d07.DistributionAndInterestPayment;
import blue.repo.finoscdm60d07.DividendAmountTypeEnum;
import blue.repo.finoscdm60d07.DividendApplicability;
import blue.repo.finoscdm60d07.DividendCompositionEnum;
import blue.repo.finoscdm60d07.DividendCurrency;
import blue.repo.finoscdm60d07.DividendDateReference;
import blue.repo.finoscdm60d07.DividendDateReferenceEnum;
import blue.repo.finoscdm60d07.DividendEntitlementEnum;
import blue.repo.finoscdm60d07.DividendPaymentDate;
import blue.repo.finoscdm60d07.DividendPayoutRatio;
import blue.repo.finoscdm60d07.DividendPeriod;
import blue.repo.finoscdm60d07.DividendPeriodEnum;
import blue.repo.finoscdm60d07.DividendReturnTerms;
import blue.repo.finoscdm60d07.DividendTerms;
import blue.repo.finoscdm60d07.Document;
import blue.repo.finoscdm60d07.DomesticCurrencyIssued;
import blue.repo.finoscdm60d07.EarlyTerminationEvent;
import blue.repo.finoscdm60d07.EarlyTerminationProvision;
import blue.repo.finoscdm60d07.EconomicTerms;
import blue.repo.finoscdm60d07.EligibilityQuery;
import blue.repo.finoscdm60d07.EligibleCollateralCriteria;
import blue.repo.finoscdm60d07.EligibleCollateralSpecification;
import blue.repo.finoscdm60d07.EligibleCollateralSpecificationInstruction;
import blue.repo.finoscdm60d07.EntityTypeEnum;
import blue.repo.finoscdm60d07.EquityAdditionalTerms;
import blue.repo.finoscdm60d07.EquityCorporateEvents;
import blue.repo.finoscdm60d07.EquityIndex;
import blue.repo.finoscdm60d07.EquityMasterConfirmation;
import blue.repo.finoscdm60d07.EquitySwapMasterConfirmation2018;
import blue.repo.finoscdm60d07.EquityTypeEnum;
import blue.repo.finoscdm60d07.EquityUnderlierProvisions;
import blue.repo.finoscdm60d07.EUEMIREligibleCollateralEnum;
import blue.repo.finoscdm60d07.EventInstruction;
import blue.repo.finoscdm60d07.EventIntentEnum;
import blue.repo.finoscdm60d07.EventTimestamp;
import blue.repo.finoscdm60d07.EventTimestampQualificationEnum;
import blue.repo.finoscdm60d07.EvergreenProvision;
import blue.repo.finoscdm60d07.ExctgPrsn;
import blue.repo.finoscdm60d07.ExecutionDetails;
import blue.repo.finoscdm60d07.ExecutionInstruction;
import blue.repo.finoscdm60d07.ExecutionLocationEnum;
import blue.repo.finoscdm60d07.ExecutionTypeEnum;
import blue.repo.finoscdm60d07.ExerciseEvent;
import blue.repo.finoscdm60d07.ExerciseFee;
import blue.repo.finoscdm60d07.ExerciseFeeSchedule;
import blue.repo.finoscdm60d07.ExerciseInstruction;
import blue.repo.finoscdm60d07.ExerciseNotice;
import blue.repo.finoscdm60d07.ExerciseNoticeGiverEnum;
import blue.repo.finoscdm60d07.ExercisePeriod;
import blue.repo.finoscdm60d07.ExerciseProcedure;
import blue.repo.finoscdm60d07.ExerciseTerms;
import blue.repo.finoscdm60d07.ExpirationTimeTypeEnum;
import blue.repo.finoscdm60d07.Exposure;
import blue.repo.finoscdm60d07.ExtendibleProvision;
import blue.repo.finoscdm60d07.ExtendibleProvisionAdjustedDates;
import blue.repo.finoscdm60d07.ExtensionEvent;
import blue.repo.finoscdm60d07.ExtraordinaryEvents;
import blue.repo.finoscdm60d07.FailureToPay;
import blue.repo.finoscdm60d07.FallbackRateParameters;
import blue.repo.finoscdm60d07.FallbackReferencePrice;
import blue.repo.finoscdm60d07.FeaturePayment;
import blue.repo.finoscdm60d07.FeeTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaAccountTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaAssetClassEnum;
import blue.repo.finoscdm60d07.FieldWithMetaBasketConstituent;
import blue.repo.finoscdm60d07.FieldWithMetaBusinessCenterEnum;
import blue.repo.finoscdm60d07.FieldWithMetaCommodityBusinessCalendarEnum;
import blue.repo.finoscdm60d07.FieldWithMetaCommodityReferencePriceEnum;
import blue.repo.finoscdm60d07.FieldWithMetaContractualDefinitionsEnum;
import blue.repo.finoscdm60d07.FieldWithMetaContractualSupplementTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaCreditLimitTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaCreditNotation;
import blue.repo.finoscdm60d07.FieldWithMetaCreditSupportAgreementTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaDayCountFractionEnum;
import blue.repo.finoscdm60d07.FieldWithMetaEntityTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaFloatingRateIndexEnum;
import blue.repo.finoscdm60d07.FieldWithMetaGoverningLawEnum;
import blue.repo.finoscdm60d07.FieldWithMetaIdentifier;
import blue.repo.finoscdm60d07.FieldWithMetaIndexAnnexSourceEnum;
import blue.repo.finoscdm60d07.FieldWithMetaInflationRateIndexEnum;
import blue.repo.finoscdm60d07.FieldWithMetaInformationProviderEnum;
import blue.repo.finoscdm60d07.FieldWithMetaInterestRateIndex;
import blue.repo.finoscdm60d07.FieldWithMetaInterpolationMethodEnum;
import blue.repo.finoscdm60d07.FieldWithMetaLimitLevelEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMarketDisruptionEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMasterAgreementTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMasterConfirmationAnnexTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMasterConfirmationTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMatrixTermEnum;
import blue.repo.finoscdm60d07.FieldWithMetaMatrixTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaNaturalPersonRoleEnum;
import blue.repo.finoscdm60d07.FieldWithMetaNonNegativeQuantitySchedule;
import blue.repo.finoscdm60d07.FieldWithMetaObservable;
import blue.repo.finoscdm60d07.FieldWithMetaPersonIdentifier;
import blue.repo.finoscdm60d07.FieldWithMetaPriceSchedule;
import blue.repo.finoscdm60d07.FieldWithMetaQuotedCurrencyPair;
import blue.repo.finoscdm60d07.FieldWithMetaResourceTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaRestructuringEnum;
import blue.repo.finoscdm60d07.FieldWithMetaSettledEntityMatrixSourceEnum;
import blue.repo.finoscdm60d07.FieldWithMetaSettlementRateOptionEnum;
import blue.repo.finoscdm60d07.FieldWithMetaSpreadScheduleTypeEnum;
import blue.repo.finoscdm60d07.FieldWithMetaString;
import blue.repo.finoscdm60d07.FieldWithMetaTimeZone;
import blue.repo.finoscdm60d07.FinalCalculationPeriodDateAdjustment;
import blue.repo.finoscdm60d07.FinalPrincipalExchangeCalculationEnum;
import blue.repo.finoscdm60d07.FinancialUnitEnum;
import blue.repo.finoscdm60d07.FinInstrm;
import blue.repo.finoscdm60d07.FinInstrmGnlAttrbts;
import blue.repo.finoscdm60d07.FinInstrmRptgTxRpt;
import blue.repo.finoscdm60d07.FixedAmountCalculationDetails;
import blue.repo.finoscdm60d07.FixedPrice;
import blue.repo.finoscdm60d07.FixedPricePayout;
import blue.repo.finoscdm60d07.FixedRateSpecification;
import blue.repo.finoscdm60d07.FloatingAmountCalculationDetails;
import blue.repo.finoscdm60d07.FloatingAmountEvents;
import blue.repo.finoscdm60d07.FloatingAmountProvisions;
import blue.repo.finoscdm60d07.FloatingRate;
import blue.repo.finoscdm60d07.FloatingRateBase;
import blue.repo.finoscdm60d07.FloatingRateCalculationParameters;
import blue.repo.finoscdm60d07.FloatingRateDefinition;
import blue.repo.finoscdm60d07.FloatingRateIndex;
import blue.repo.finoscdm60d07.FloatingRateIndexCalculationDefaults;
import blue.repo.finoscdm60d07.FloatingRateIndexCalculationMethodEnum;
import blue.repo.finoscdm60d07.FloatingRateIndexCategoryEnum;
import blue.repo.finoscdm60d07.FloatingRateIndexDefinition;
import blue.repo.finoscdm60d07.FloatingRateIndexEnum;
import blue.repo.finoscdm60d07.FloatingRateIndexIdentification;
import blue.repo.finoscdm60d07.FloatingRateIndexProcessingTypeEnum;
import blue.repo.finoscdm60d07.FloatingRateIndexStyleEnum;
import blue.repo.finoscdm60d07.FloatingRateProcessingDetails;
import blue.repo.finoscdm60d07.FloatingRateProcessingParameters;
import blue.repo.finoscdm60d07.FloatingRateSettingDetails;
import blue.repo.finoscdm60d07.FloatingRateSpecification;
import blue.repo.finoscdm60d07.ForeignExchange;
import blue.repo.finoscdm60d07.ForeignExchangeRateIndex;
import blue.repo.finoscdm60d07.FPVFinalPriceElectionFallbackEnum;
import blue.repo.finoscdm60d07.Frequency;
import blue.repo.finoscdm60d07.FundProductTypeEnum;
import blue.repo.finoscdm60d07.FutureValueAmount;
import blue.repo.finoscdm60d07.FxAdditionalTerms;
import blue.repo.finoscdm60d07.FxFeature;
import blue.repo.finoscdm60d07.FxFixingDate;
import blue.repo.finoscdm60d07.FxInformationSource;
import blue.repo.finoscdm60d07.FxLinkedNotionalAmount;
import blue.repo.finoscdm60d07.FxLinkedNotionalSchedule;
import blue.repo.finoscdm60d07.FxRate;
import blue.repo.finoscdm60d07.FxRateSourceFixing;
import blue.repo.finoscdm60d07.FxSettlementRateSource;
import blue.repo.finoscdm60d07.FxSpotRateSource;
import blue.repo.finoscdm60d07.GeneralTerms;
import blue.repo.finoscdm60d07.GoverningLawEnum;
import blue.repo.finoscdm60d07.GracePeriodExtension;
import blue.repo.finoscdm60d07.HaircutIndicatorEnum;
import blue.repo.finoscdm60d07.Id;
import blue.repo.finoscdm60d07.IdentifiedList;
import blue.repo.finoscdm60d07.Identifier;
import blue.repo.finoscdm60d07.IndependentAmount;
import blue.repo.finoscdm60d07.Index;
import blue.repo.finoscdm60d07.IndexAdjustmentEvents;
import blue.repo.finoscdm60d07.IndexAnnexSourceEnum;
import blue.repo.finoscdm60d07.IndexBase;
import blue.repo.finoscdm60d07.IndexEventConsequenceEnum;
import blue.repo.finoscdm60d07.IndexTransitionInstruction;
import blue.repo.finoscdm60d07.Indx;
import blue.repo.finoscdm60d07.InflationCalculationMethodEnum;
import blue.repo.finoscdm60d07.InflationCalculationStyleEnum;
import blue.repo.finoscdm60d07.InflationIndex;
import blue.repo.finoscdm60d07.InflationRateIndexEnum;
import blue.repo.finoscdm60d07.InflationRateSpecification;
import blue.repo.finoscdm60d07.InformationProviderEnum;
import blue.repo.finoscdm60d07.InformationSource;
import blue.repo.finoscdm60d07.InitialFixingDate;
import blue.repo.finoscdm60d07.Instruction;
import blue.repo.finoscdm60d07.InstructionFunctionEnum;
import blue.repo.finoscdm60d07.Instrument;
import blue.repo.finoscdm60d07.InstrumentBase;
import blue.repo.finoscdm60d07.InstrumentTypeEnum;
import blue.repo.finoscdm60d07.InterestAmountApplication;
import blue.repo.finoscdm60d07.InterestRateCurve;
import blue.repo.finoscdm60d07.InterestRateIndex;
import blue.repo.finoscdm60d07.InterestRatePayout;
import blue.repo.finoscdm60d07.InterestShortFall;
import blue.repo.finoscdm60d07.InterestShortfallCapEnum;
import blue.repo.finoscdm60d07.InterpolationMethodEnum;
import blue.repo.finoscdm60d07.Inventory;
import blue.repo.finoscdm60d07.InventoryRecord;
import blue.repo.finoscdm60d07.InvstmtDcsnPrsn;
import blue.repo.finoscdm60d07.ISOCountryCodeEnum;
import blue.repo.finoscdm60d07.ISOCurrencyCodeEnum;
import blue.repo.finoscdm60d07.IssuerAgencyRating;
import blue.repo.finoscdm60d07.IssuerCountryOfOrigin;
import blue.repo.finoscdm60d07.IssuerName;
import blue.repo.finoscdm60d07.IssuerTypeEnum;
import blue.repo.finoscdm60d07.Key;
import blue.repo.finoscdm60d07.Knock;
import blue.repo.finoscdm60d07.Lag;
import blue.repo.finoscdm60d07.LegalAgreement;
import blue.repo.finoscdm60d07.LegalAgreementBase;
import blue.repo.finoscdm60d07.LegalAgreementIdentification;
import blue.repo.finoscdm60d07.LegalAgreementPublisherEnum;
import blue.repo.finoscdm60d07.LegalAgreementTypeEnum;
import blue.repo.finoscdm60d07.LegalEntity;
import blue.repo.finoscdm60d07.LengthUnitEnum;
import blue.repo.finoscdm60d07.LimitApplicable;
import blue.repo.finoscdm60d07.LimitApplicableExtended;
import blue.repo.finoscdm60d07.LimitLevelEnum;
import blue.repo.finoscdm60d07.Lineage;
import blue.repo.finoscdm60d07.ListedDerivative;
import blue.repo.finoscdm60d07.ListingExchange;
import blue.repo.finoscdm60d07.ListingSector;
import blue.repo.finoscdm60d07.LoadTypeEnum;
import blue.repo.finoscdm60d07.Loan;
import blue.repo.finoscdm60d07.LoanParticipation;
import blue.repo.finoscdm60d07.LocationIdentifier;
import blue.repo.finoscdm60d07.MakeWholeAmount;
import blue.repo.finoscdm60d07.MandatoryEarlyTermination;
import blue.repo.finoscdm60d07.MandatoryEarlyTerminationAdjustedDates;
import blue.repo.finoscdm60d07.ManualExercise;
import blue.repo.finoscdm60d07.MarginCallActionEnum;
import blue.repo.finoscdm60d07.MarginCallBase;
import blue.repo.finoscdm60d07.MarginCallExposure;
import blue.repo.finoscdm60d07.MarginCallInstructionType;
import blue.repo.finoscdm60d07.MarginCallIssuance;
import blue.repo.finoscdm60d07.MarginCallResponse;
import blue.repo.finoscdm60d07.MarginCallResponseAction;
import blue.repo.finoscdm60d07.MarginCallResponseTypeEnum;
import blue.repo.finoscdm60d07.MarginTypeEnum;
import blue.repo.finoscdm60d07.MarketDisruptionEnum;
import blue.repo.finoscdm60d07.MasterAgreementClause;
import blue.repo.finoscdm60d07.MasterAgreementClauseIdentifierEnum;
import blue.repo.finoscdm60d07.MasterAgreementClauseVariant;
import blue.repo.finoscdm60d07.MasterAgreementSchedule;
import blue.repo.finoscdm60d07.MasterAgreementTypeEnum;
import blue.repo.finoscdm60d07.MasterAgreementVariableSet;
import blue.repo.finoscdm60d07.MasterAgreementVariantIdentifierEnum;
import blue.repo.finoscdm60d07.MasterConfirmationAnnexTypeEnum;
import blue.repo.finoscdm60d07.MasterConfirmationBase;
import blue.repo.finoscdm60d07.MasterConfirmationTypeEnum;
import blue.repo.finoscdm60d07.MatrixTermEnum;
import blue.repo.finoscdm60d07.MatrixTypeEnum;
import blue.repo.finoscdm60d07.MaturityTypeEnum;
import blue.repo.finoscdm60d07.Measure;
import blue.repo.finoscdm60d07.MeasureBase;
import blue.repo.finoscdm60d07.MeasureSchedule;
import blue.repo.finoscdm60d07.MessageInformation;
import blue.repo.finoscdm60d07.MetaFields;
import blue.repo.finoscdm60d07.Money;
import blue.repo.finoscdm60d07.MoneyBound;
import blue.repo.finoscdm60d07.MoneyMarketTypeEnum;
import blue.repo.finoscdm60d07.MoneyRange;
import blue.repo.finoscdm60d07.MultipleCreditNotations;
import blue.repo.finoscdm60d07.MultipleDebtTypes;
import blue.repo.finoscdm60d07.MultipleExercise;
import blue.repo.finoscdm60d07.MultipleValuationDates;
import blue.repo.finoscdm60d07.NationalizationOrInsolvencyOrDelistingEventEnum;
import blue.repo.finoscdm60d07.NaturalPerson;
import blue.repo.finoscdm60d07.NaturalPersonRole;
import blue.repo.finoscdm60d07.NaturalPersonRoleEnum;
import blue.repo.finoscdm60d07.NegativeCriteria;
import blue.repo.finoscdm60d07.NegativeInterestRateTreatmentEnum;
import blue.repo.finoscdm60d07.New;
import blue.repo.finoscdm60d07.Nm;
import blue.repo.finoscdm60d07.NonCashDividendTreatmentEnum;
import blue.repo.finoscdm60d07.NonNegativeQuantity;
import blue.repo.finoscdm60d07.NonNegativeQuantitySchedule;
import blue.repo.finoscdm60d07.NonNegativeStep;
import blue.repo.finoscdm60d07.NonTransferableProduct;
import blue.repo.finoscdm60d07.NotDomesticCurrency;
import blue.repo.finoscdm60d07.NotionalAdjustmentEnum;
import blue.repo.finoscdm60d07.NumberBound;
import blue.repo.finoscdm60d07.NumberRange;
import blue.repo.finoscdm60d07.ObligationCategoryEnum;
import blue.repo.finoscdm60d07.Obligations;
import blue.repo.finoscdm60d07.Observable;
import blue.repo.finoscdm60d07.Observation;
import blue.repo.finoscdm60d07.ObservationDate;
import blue.repo.finoscdm60d07.ObservationDates;
import blue.repo.finoscdm60d07.ObservationEvent;
import blue.repo.finoscdm60d07.ObservationIdentifier;
import blue.repo.finoscdm60d07.ObservationInstruction;
import blue.repo.finoscdm60d07.ObservationParameters;
import blue.repo.finoscdm60d07.ObservationPeriodDatesEnum;
import blue.repo.finoscdm60d07.ObservationSchedule;
import blue.repo.finoscdm60d07.ObservationShiftCalculation;
import blue.repo.finoscdm60d07.ObservationTerms;
import blue.repo.finoscdm60d07.Offset;
import blue.repo.finoscdm60d07.OffsetCalculation;
import blue.repo.finoscdm60d07.OptionalEarlyTermination;
import blue.repo.finoscdm60d07.OptionalEarlyTerminationAdjustedDates;
import blue.repo.finoscdm60d07.OptionExerciseStyleEnum;
import blue.repo.finoscdm60d07.OptionFeature;
import blue.repo.finoscdm60d07.OptionPayout;
import blue.repo.finoscdm60d07.OptionStrike;
import blue.repo.finoscdm60d07.OptionTypeEnum;
import blue.repo.finoscdm60d07.OrdrTrnsmssn;
import blue.repo.finoscdm60d07.OtherAgreement;
import blue.repo.finoscdm60d07.OtherAgreementTerms;
import blue.repo.finoscdm60d07.OtherIndex;
import blue.repo.finoscdm60d07.Othr;
import blue.repo.finoscdm60d07.ParametricDates;
import blue.repo.finoscdm60d07.PartialExercise;
import blue.repo.finoscdm60d07.Party;
import blue.repo.finoscdm60d07.PartyChangeInstruction;
import blue.repo.finoscdm60d07.PartyContactInformation;
import blue.repo.finoscdm60d07.PartyCustomisedWorkflow;
import blue.repo.finoscdm60d07.PartyDeterminationEnum;
import blue.repo.finoscdm60d07.PartyIdentifier;
import blue.repo.finoscdm60d07.PartyIdentifierTypeEnum;
import blue.repo.finoscdm60d07.PartyReferencePayerReceiver;
import blue.repo.finoscdm60d07.PartyRole;
import blue.repo.finoscdm60d07.PartyRoleEnum;
import blue.repo.finoscdm60d07.PassThrough;
import blue.repo.finoscdm60d07.PassThroughItem;
import blue.repo.finoscdm60d07.PayerReceiver;
import blue.repo.finoscdm60d07.PayerReceiverEnum;
import blue.repo.finoscdm60d07.PaymentCalculationPeriod;
import blue.repo.finoscdm60d07.PaymentDates;
import blue.repo.finoscdm60d07.PaymentDateSchedule;
import blue.repo.finoscdm60d07.PaymentDetail;
import blue.repo.finoscdm60d07.PaymentDiscounting;
import blue.repo.finoscdm60d07.PaymentRule;
import blue.repo.finoscdm60d07.Payout;
import blue.repo.finoscdm60d07.PayoutBase;
import blue.repo.finoscdm60d07.PayRelativeToEnum;
import blue.repo.finoscdm60d07.PCDeliverableObligationCharac;
import blue.repo.finoscdm60d07.PercentageRule;
import blue.repo.finoscdm60d07.PerformancePayout;
import blue.repo.finoscdm60d07.PerformanceTransferTypeEnum;
import blue.repo.finoscdm60d07.PerformanceValuationDates;
import blue.repo.finoscdm60d07.Period;
import blue.repo.finoscdm60d07.PeriodBound;
import blue.repo.finoscdm60d07.PeriodEnum;
import blue.repo.finoscdm60d07.PeriodExtendedEnum;
import blue.repo.finoscdm60d07.PeriodicDates;
import blue.repo.finoscdm60d07.PeriodRange;
import blue.repo.finoscdm60d07.PeriodTimeEnum;
import blue.repo.finoscdm60d07.PersonIdentifier;
import blue.repo.finoscdm60d07.PersonIdentifierTypeEnum;
import blue.repo.finoscdm60d07.PhysicalSettlementPeriod;
import blue.repo.finoscdm60d07.PhysicalSettlementTerms;
import blue.repo.finoscdm60d07.Portfolio;
import blue.repo.finoscdm60d07.PortfolioReturnTerms;
import blue.repo.finoscdm60d07.PortfolioState;
import blue.repo.finoscdm60d07.Position;
import blue.repo.finoscdm60d07.PositionEventIntentEnum;
import blue.repo.finoscdm60d07.PositionIdentifier;
import blue.repo.finoscdm60d07.PositionStatusEnum;
import blue.repo.finoscdm60d07.PremiumExpression;
import blue.repo.finoscdm60d07.PremiumTypeEnum;
import blue.repo.finoscdm60d07.Pric;
import blue.repo.finoscdm60d07.Price;
import blue.repo.finoscdm60d07.PriceComposite;
import blue.repo.finoscdm60d07.PriceExpressionEnum;
import blue.repo.finoscdm60d07.PriceOperandEnum;
import blue.repo.finoscdm60d07.PriceQuantity;
import blue.repo.finoscdm60d07.PriceReturnTerms;
import blue.repo.finoscdm60d07.PriceSchedule;
import blue.repo.finoscdm60d07.PriceSource;
import blue.repo.finoscdm60d07.PriceSourceDisruption;
import blue.repo.finoscdm60d07.PriceTimingEnum;
import blue.repo.finoscdm60d07.PriceTypeEnum;
import blue.repo.finoscdm60d07.PricingDates;
import blue.repo.finoscdm60d07.PrimitiveInstruction;
import blue.repo.finoscdm60d07.PrincipalPayment;
import blue.repo.finoscdm60d07.PrincipalPayments;
import blue.repo.finoscdm60d07.PrincipalPaymentSchedule;
import blue.repo.finoscdm60d07.Product;
import blue.repo.finoscdm60d07.ProductIdentifier;
import blue.repo.finoscdm60d07.ProductIdTypeEnum;
import blue.repo.finoscdm60d07.ProductTaxonomy;
import blue.repo.finoscdm60d07.ProtectionTerms;
import blue.repo.finoscdm60d07.Prsn;
import blue.repo.finoscdm60d07.PubliclyAvailableInformation;
import blue.repo.finoscdm60d07.PutCallEnum;
import blue.repo.finoscdm60d07.Qty;
import blue.repo.finoscdm60d07.QuantifierEnum;
import blue.repo.finoscdm60d07.Quantity;
import blue.repo.finoscdm60d07.QuantityChangeDirectionEnum;
import blue.repo.finoscdm60d07.QuantityChangeInstruction;
import blue.repo.finoscdm60d07.QuantityMultiplier;
import blue.repo.finoscdm60d07.QuantitySchedule;
import blue.repo.finoscdm60d07.Quanto;
import blue.repo.finoscdm60d07.QuasiGovernmentIssuerType;
import blue.repo.finoscdm60d07.QuotationRateTypeEnum;
import blue.repo.finoscdm60d07.QuotationSideEnum;
import blue.repo.finoscdm60d07.QuotationStyleEnum;
import blue.repo.finoscdm60d07.QuoteBasisEnum;
import blue.repo.finoscdm60d07.QuotedCurrencyPair;
import blue.repo.finoscdm60d07.RateObservation;
import blue.repo.finoscdm60d07.RateSchedule;
import blue.repo.finoscdm60d07.RateSpecification;
import blue.repo.finoscdm60d07.RateTreatmentEnum;
import blue.repo.finoscdm60d07.RatingPriorityResolutionEnum;
import blue.repo.finoscdm60d07.RealisedVarianceMethodEnum;
import blue.repo.finoscdm60d07.RecordAmountTypeEnum;
import blue.repo.finoscdm60d07.Reference;
import blue.repo.finoscdm60d07.ReferenceBank;
import blue.repo.finoscdm60d07.ReferenceBanks;
import blue.repo.finoscdm60d07.ReferenceInformation;
import blue.repo.finoscdm60d07.ReferenceObligation;
import blue.repo.finoscdm60d07.ReferencePair;
import blue.repo.finoscdm60d07.ReferencePool;
import blue.repo.finoscdm60d07.ReferencePoolItem;
import blue.repo.finoscdm60d07.ReferenceSwapCurve;
import blue.repo.finoscdm60d07.ReferenceWithMetaAccount;
import blue.repo.finoscdm60d07.ReferenceWithMetaAdjustableOrRelativeDate;
import blue.repo.finoscdm60d07.ReferenceWithMetaAdjustableOrRelativeDates;
import blue.repo.finoscdm60d07.ReferenceWithMetaBasketConstituent;
import blue.repo.finoscdm60d07.ReferenceWithMetaBusinessCenters;
import blue.repo.finoscdm60d07.ReferenceWithMetaBusinessDayAdjustments;
import blue.repo.finoscdm60d07.ReferenceWithMetaCalculationPeriodDates;
import blue.repo.finoscdm60d07.ReferenceWithMetaCashSettlementTerms;
import blue.repo.finoscdm60d07.ReferenceWithMetaCollateral;
import blue.repo.finoscdm60d07.ReferenceWithMetaCollateralPortfolio;
import blue.repo.finoscdm60d07.ReferenceWithMetaContractDetails;
import blue.repo.finoscdm60d07.ReferenceWithMetaCreditEvents;
import blue.repo.finoscdm60d07.ReferenceWithMetaExecutionDetails;
import blue.repo.finoscdm60d07.ReferenceWithMetaFixedRateSpecification;
import blue.repo.finoscdm60d07.ReferenceWithMetaInterestRateIndex;
import blue.repo.finoscdm60d07.ReferenceWithMetaInterestRatePayout;
import blue.repo.finoscdm60d07.ReferenceWithMetaLegalAgreement;
import blue.repo.finoscdm60d07.ReferenceWithMetaLegalEntity;
import blue.repo.finoscdm60d07.ReferenceWithMetaMoney;
import blue.repo.finoscdm60d07.ReferenceWithMetaNaturalPerson;
import blue.repo.finoscdm60d07.ReferenceWithMetaNonNegativeQuantitySchedule;
import blue.repo.finoscdm60d07.ReferenceWithMetaObservable;
import blue.repo.finoscdm60d07.ReferenceWithMetaObservation;
import blue.repo.finoscdm60d07.ReferenceWithMetaOptionPayout;
import blue.repo.finoscdm60d07.ReferenceWithMetaParty;
import blue.repo.finoscdm60d07.ReferenceWithMetaPaymentDates;
import blue.repo.finoscdm60d07.ReferenceWithMetaPayout;
import blue.repo.finoscdm60d07.ReferenceWithMetaPerformanceValuationDates;
import blue.repo.finoscdm60d07.ReferenceWithMetaPhysicalSettlementTerms;
import blue.repo.finoscdm60d07.ReferenceWithMetaPortfolioState;
import blue.repo.finoscdm60d07.ReferenceWithMetaPriceSchedule;
import blue.repo.finoscdm60d07.ReferenceWithMetaProtectionTerms;
import blue.repo.finoscdm60d07.ReferenceWithMetaQuotedCurrencyPair;
import blue.repo.finoscdm60d07.ReferenceWithMetaRateObservation;
import blue.repo.finoscdm60d07.ReferenceWithMetaResolvablePriceQuantity;
import blue.repo.finoscdm60d07.ReferenceWithMetaString;
import blue.repo.finoscdm60d07.ReferenceWithMetaTrade;
import blue.repo.finoscdm60d07.ReferenceWithMetaTradeState;
import blue.repo.finoscdm60d07.ReferenceWithMetaWorkflowStep;
import blue.repo.finoscdm60d07.RefRate;
import blue.repo.finoscdm60d07.RegIMRoleEnum;
import blue.repo.finoscdm60d07.RegionalGovernmentIssuerType;
import blue.repo.finoscdm60d07.RegMarginTypeEnum;
import blue.repo.finoscdm60d07.RelatedParty;
import blue.repo.finoscdm60d07.RelativeDateOffset;
import blue.repo.finoscdm60d07.RelativeDates;
import blue.repo.finoscdm60d07.RepoDurationEnum;
import blue.repo.finoscdm60d07.Representations;
import blue.repo.finoscdm60d07.Reset;
import blue.repo.finoscdm60d07.ResetDates;
import blue.repo.finoscdm60d07.ResetFrequency;
import blue.repo.finoscdm60d07.ResetInstruction;
import blue.repo.finoscdm60d07.ResetRelativeToEnum;
import blue.repo.finoscdm60d07.ResolvablePriceQuantity;
import blue.repo.finoscdm60d07.Resource;
import blue.repo.finoscdm60d07.ResourceLength;
import blue.repo.finoscdm60d07.ResourceTypeEnum;
import blue.repo.finoscdm60d07.Restructuring;
import blue.repo.finoscdm60d07.RestructuringEnum;
import blue.repo.finoscdm60d07.ReturnAmount;
import blue.repo.finoscdm60d07.ReturnInstruction;
import blue.repo.finoscdm60d07.ReturnTerms;
import blue.repo.finoscdm60d07.ReturnTermsBase;
import blue.repo.finoscdm60d07.ReturnTypeEnum;
import blue.repo.finoscdm60d07.RollConventionEnum;
import blue.repo.finoscdm60d07.RollFeature;
import blue.repo.finoscdm60d07.RollSourceCalendarEnum;
import blue.repo.finoscdm60d07.Rounding;
import blue.repo.finoscdm60d07.RoundingDirectionEnum;
import blue.repo.finoscdm60d07.RoundingFrequencyEnum;
import blue.repo.finoscdm60d07.RoundingModeEnum;
import blue.repo.finoscdm60d07.Schedule;
import blue.repo.finoscdm60d07.ScheduledTransfer;
import blue.repo.finoscdm60d07.ScheduledTransferEnum;
import blue.repo.finoscdm60d07.SchedulePeriod;
import blue.repo.finoscdm60d07.SchmeNm;
import blue.repo.finoscdm60d07.Security;
import blue.repo.finoscdm60d07.SecurityAgreementElections;
import blue.repo.finoscdm60d07.SecurityLendingInvoice;
import blue.repo.finoscdm60d07.SecurityLocate;
import blue.repo.finoscdm60d07.Sellr;
import blue.repo.finoscdm60d07.SettledEntityMatrix;
import blue.repo.finoscdm60d07.SettledEntityMatrixSourceEnum;
import blue.repo.finoscdm60d07.SettlementBase;
import blue.repo.finoscdm60d07.SettlementCentreEnum;
import blue.repo.finoscdm60d07.SettlementDate;
import blue.repo.finoscdm60d07.SettlementPayout;
import blue.repo.finoscdm60d07.SettlementProvision;
import blue.repo.finoscdm60d07.SettlementRateOption;
import blue.repo.finoscdm60d07.SettlementRateOptionEnum;
import blue.repo.finoscdm60d07.SettlementTerms;
import blue.repo.finoscdm60d07.SettlementTypeEnum;
import blue.repo.finoscdm60d07.ShapingProvision;
import blue.repo.finoscdm60d07.ShareExtraordinaryEventEnum;
import blue.repo.finoscdm60d07.SingleValuationDate;
import blue.repo.finoscdm60d07.Sngl;
import blue.repo.finoscdm60d07.SovereignAgencyRating;
import blue.repo.finoscdm60d07.SpecialPurposeVehicleIssuerType;
import blue.repo.finoscdm60d07.SpecificAsset;
import blue.repo.finoscdm60d07.SpecifiedCurrency;
import blue.repo.finoscdm60d07.SpecifiedEntityClauseEnum;
import blue.repo.finoscdm60d07.SpecifiedEntityTermsEnum;
import blue.repo.finoscdm60d07.SplitInstruction;
import blue.repo.finoscdm60d07.SpreadCalculationMethodEnum;
import blue.repo.finoscdm60d07.SpreadSchedule;
import blue.repo.finoscdm60d07.SpreadScheduleTypeEnum;
import blue.repo.finoscdm60d07.StandardizedSchedule;
import blue.repo.finoscdm60d07.StandardizedScheduleAssetClassEnum;
import blue.repo.finoscdm60d07.StandardizedScheduleInitialMargin;
import blue.repo.finoscdm60d07.StandardizedScheduleProductClassEnum;
import blue.repo.finoscdm60d07.StandardizedScheduleTradeInfo;
import blue.repo.finoscdm60d07.StandardSettlementStyleEnum;
import blue.repo.finoscdm60d07.State;
import blue.repo.finoscdm60d07.StockSplitInstruction;
import blue.repo.finoscdm60d07.StrategyFeature;
import blue.repo.finoscdm60d07.Strike;
import blue.repo.finoscdm60d07.StrikeSchedule;
import blue.repo.finoscdm60d07.StrikeSpread;
import blue.repo.finoscdm60d07.StubCalculationPeriodAmount;
import blue.repo.finoscdm60d07.StubFloatingRate;
import blue.repo.finoscdm60d07.StubPeriod;
import blue.repo.finoscdm60d07.StubPeriodTypeEnum;
import blue.repo.finoscdm60d07.StubValue;
import blue.repo.finoscdm60d07.SubstitutionProvisions;
import blue.repo.finoscdm60d07.SupraNationalIssuerTypeEnum;
import blue.repo.finoscdm60d07.SwapCurveValuation;
import blue.repo.finoscdm60d07.Swp;
import blue.repo.finoscdm60d07.SwpIn;
import blue.repo.finoscdm60d07.SwpOut;
import blue.repo.finoscdm60d07.Taxonomy;
import blue.repo.finoscdm60d07.TaxonomyClassification;
import blue.repo.finoscdm60d07.TaxonomySourceEnum;
import blue.repo.finoscdm60d07.TaxonomyValue;
import blue.repo.finoscdm60d07.TelephoneNumber;
import blue.repo.finoscdm60d07.TelephoneTypeEnum;
import blue.repo.finoscdm60d07.Term;
import blue.repo.finoscdm60d07.TerminationCurrencyConditionEnum;
import blue.repo.finoscdm60d07.TerminationProvision;
import blue.repo.finoscdm60d07.TermsChangeInstruction;
import blue.repo.finoscdm60d07.TimeTypeEnum;
import blue.repo.finoscdm60d07.TimeUnitEnum;
import blue.repo.finoscdm60d07.TimeZone;
import blue.repo.finoscdm60d07.TradableProduct;
import blue.repo.finoscdm60d07.Trade;
import blue.repo.finoscdm60d07.TradeIdentifier;
import blue.repo.finoscdm60d07.TradeIdentifierTypeEnum;
import blue.repo.finoscdm60d07.TradeLot;
import blue.repo.finoscdm60d07.TradePricingReport;
import blue.repo.finoscdm60d07.TradeState;
import blue.repo.finoscdm60d07.Tranche;
import blue.repo.finoscdm60d07.TransactedPrice;
import blue.repo.finoscdm60d07.TransactionAdditionalTerms;
import blue.repo.finoscdm60d07.Transfer;
import blue.repo.finoscdm60d07.TransferableProduct;
import blue.repo.finoscdm60d07.TransferExpression;
import blue.repo.finoscdm60d07.TransferInstruction;
import blue.repo.finoscdm60d07.TransferSettlementEnum;
import blue.repo.finoscdm60d07.TransferState;
import blue.repo.finoscdm60d07.TransferStatusEnum;
import blue.repo.finoscdm60d07.Trigger;
import blue.repo.finoscdm60d07.TriggerEvent;
import blue.repo.finoscdm60d07.TriggerTimeTypeEnum;
import blue.repo.finoscdm60d07.TriggerTypeEnum;
import blue.repo.finoscdm60d07.Tx;
import blue.repo.finoscdm60d07.UKEMIREligibleCollateralEnum;
import blue.repo.finoscdm60d07.UmbrellaAgreement;
import blue.repo.finoscdm60d07.UmbrellaAgreementEntity;
import blue.repo.finoscdm60d07.Underlier;
import blue.repo.finoscdm60d07.UnderlierSubstitutionProvision;
import blue.repo.finoscdm60d07.UndrlygInstrm;
import blue.repo.finoscdm60d07.UnitType;
import blue.repo.finoscdm60d07.USCFTCPREligibleCollateralEnum;
import blue.repo.finoscdm60d07.Valuation;
import blue.repo.finoscdm60d07.ValuationDate;
import blue.repo.finoscdm60d07.ValuationDates;
import blue.repo.finoscdm60d07.ValuationInstruction;
import blue.repo.finoscdm60d07.ValuationMethod;
import blue.repo.finoscdm60d07.ValuationMethodEnum;
import blue.repo.finoscdm60d07.ValuationPostponement;
import blue.repo.finoscdm60d07.ValuationSource;
import blue.repo.finoscdm60d07.ValuationSourceEnum;
import blue.repo.finoscdm60d07.ValuationTerms;
import blue.repo.finoscdm60d07.ValuationTypeEnum;
import blue.repo.finoscdm60d07.VarianceCapFloor;
import blue.repo.finoscdm60d07.VarianceReturnTerms;
import blue.repo.finoscdm60d07.Velocity;
import blue.repo.finoscdm60d07.VolatilityCapFloor;
import blue.repo.finoscdm60d07.VolatilityReturnTerms;
import blue.repo.finoscdm60d07.WarehouseIdentityEnum;
import blue.repo.finoscdm60d07.WeatherUnitEnum;
import blue.repo.finoscdm60d07.WeeklyRollConventionEnum;
import blue.repo.finoscdm60d07.WeightedAveragingObservation;
import blue.repo.finoscdm60d07.Workflow;
import blue.repo.finoscdm60d07.WorkflowState;
import blue.repo.finoscdm60d07.WorkflowStatusEnum;
import blue.repo.finoscdm60d07.WorkflowStep;
import blue.repo.finoscdm60d07.WorkflowStepApproval;

public final class FINOSCDM60d07Types {
    public static final RepositoryType ACCOUNT = Account.repositoryType();

    public static final RepositoryType ACCOUNTTYPEENUM = AccountTypeEnum.repositoryType();

    public static final RepositoryType ACCTOWNR = AcctOwnr.repositoryType();

    public static final RepositoryType ACTIONENUM = ActionEnum.repositoryType();

    public static final RepositoryType ADDITIONALDISRUPTIONEVENTS = AdditionalDisruptionEvents.repositoryType();

    public static final RepositoryType ADDITIONALFIXEDPAYMENTS = AdditionalFixedPayments.repositoryType();

    public static final RepositoryType ADDRESS = Address.repositoryType();

    public static final RepositoryType ADDRESSFORNOTICES = AddressForNotices.repositoryType();

    public static final RepositoryType ADDTLATTRBTS = AddtlAttrbts.repositoryType();

    public static final RepositoryType ADJUSTABLEDATE = AdjustableDate.repositoryType();

    public static final RepositoryType ADJUSTABLEDATES = AdjustableDates.repositoryType();

    public static final RepositoryType ADJUSTABLEORADJUSTEDDATE = AdjustableOrAdjustedDate.repositoryType();

    public static final RepositoryType ADJUSTABLEORADJUSTEDORRELATIVEDATE = AdjustableOrAdjustedOrRelativeDate.repositoryType();

    public static final RepositoryType ADJUSTABLEORRELATIVEDATE = AdjustableOrRelativeDate.repositoryType();

    public static final RepositoryType ADJUSTABLEORRELATIVEDATES = AdjustableOrRelativeDates.repositoryType();

    public static final RepositoryType ADJUSTABLERELATIVEORPERIODICDATES = AdjustableRelativeOrPeriodicDates.repositoryType();

    public static final RepositoryType ADJUSTEDRELATIVEDATEOFFSET = AdjustedRelativeDateOffset.repositoryType();

    public static final RepositoryType AFFIRMATIONSTATUSENUM = AffirmationStatusEnum.repositoryType();

    public static final RepositoryType AGENCYRATINGCRITERIA = AgencyRatingCriteria.repositoryType();

    public static final RepositoryType AGGREGATIONPARAMETERS = AggregationParameters.repositoryType();

    public static final RepositoryType AGREEMENT = Agreement.repositoryType();

    public static final RepositoryType AGREEMENTNAME = AgreementName.repositoryType();

    public static final RepositoryType AGREEMENTTERMS = AgreementTerms.repositoryType();

    public static final RepositoryType ALLCRITERIA = AllCriteria.repositoryType();

    public static final RepositoryType ALTERNATIVETOINTERESTAMOUNTENUM = AlternativeToInterestAmountEnum.repositoryType();

    public static final RepositoryType AMOUNTSCHEDULE = AmountSchedule.repositoryType();

    public static final RepositoryType ANCILLARYENTITY = AncillaryEntity.repositoryType();

    public static final RepositoryType ANCILLARYPARTY = AncillaryParty.repositoryType();

    public static final RepositoryType ANCILLARYROLEENUM = AncillaryRoleEnum.repositoryType();

    public static final RepositoryType ANYCRITERIA = AnyCriteria.repositoryType();

    public static final RepositoryType ARITHMETICOPERATIONENUM = ArithmeticOperationEnum.repositoryType();

    public static final RepositoryType ASIAN = Asian.repositoryType();

    public static final RepositoryType ASSET = Asset.repositoryType();

    public static final RepositoryType ASSETAGENCYRATING = AssetAgencyRating.repositoryType();

    public static final RepositoryType ASSETBASE = AssetBase.repositoryType();

    public static final RepositoryType ASSETCLASSENUM = AssetClassEnum.repositoryType();

    public static final RepositoryType ASSETCOUNTRYOFORIGIN = AssetCountryOfOrigin.repositoryType();

    public static final RepositoryType ASSETDELIVERYINFORMATION = AssetDeliveryInformation.repositoryType();

    public static final RepositoryType ASSETDELIVERYPERIODS = AssetDeliveryPeriods.repositoryType();

    public static final RepositoryType ASSETDELIVERYPROFILE = AssetDeliveryProfile.repositoryType();

    public static final RepositoryType ASSETDELIVERYPROFILEBLOCK = AssetDeliveryProfileBlock.repositoryType();

    public static final RepositoryType ASSETFLOWBASE = AssetFlowBase.repositoryType();

    public static final RepositoryType ASSETIDENTIFIER = AssetIdentifier.repositoryType();

    public static final RepositoryType ASSETIDTYPEENUM = AssetIdTypeEnum.repositoryType();

    public static final RepositoryType ASSETLEG = AssetLeg.repositoryType();

    public static final RepositoryType ASSETMATURITY = AssetMaturity.repositoryType();

    public static final RepositoryType ASSETPAYOUT = AssetPayout.repositoryType();

    public static final RepositoryType ASSETPAYOUTTRADETYPEENUM = AssetPayoutTradeTypeEnum.repositoryType();

    public static final RepositoryType ASSETTRANSFERTYPEENUM = AssetTransferTypeEnum.repositoryType();

    public static final RepositoryType ASSETTYPE = AssetType.repositoryType();

    public static final RepositoryType ASSETTYPEENUM = AssetTypeEnum.repositoryType();

    public static final RepositoryType ASSIGNEDIDENTIFIER = AssignedIdentifier.repositoryType();

    public static final RepositoryType AUTOMATICEXERCISE = AutomaticExercise.repositoryType();

    public static final RepositoryType AVAILABLEINVENTORY = AvailableInventory.repositoryType();

    public static final RepositoryType AVAILABLEINVENTORYRECORD = AvailableInventoryRecord.repositoryType();

    public static final RepositoryType AVAILABLEINVENTORYTYPEENUM = AvailableInventoryTypeEnum.repositoryType();

    public static final RepositoryType AVERAGETRADINGVOLUME = AverageTradingVolume.repositoryType();

    public static final RepositoryType AVERAGETRADINGVOLUMEMETHODOLOGYENUM = AverageTradingVolumeMethodologyEnum.repositoryType();

    public static final RepositoryType AVERAGINGCALCULATION = AveragingCalculation.repositoryType();

    public static final RepositoryType AVERAGINGCALCULATIONMETHOD = AveragingCalculationMethod.repositoryType();

    public static final RepositoryType AVERAGINGCALCULATIONMETHODENUM = AveragingCalculationMethodEnum.repositoryType();

    public static final RepositoryType AVERAGINGINOUTENUM = AveragingInOutEnum.repositoryType();

    public static final RepositoryType AVERAGINGOBSERVATIONLIST = AveragingObservationList.repositoryType();

    public static final RepositoryType AVERAGINGPERIOD = AveragingPeriod.repositoryType();

    public static final RepositoryType AVERAGINGSCHEDULE = AveragingSchedule.repositoryType();

    public static final RepositoryType AVERAGINGSTRIKEFEATURE = AveragingStrikeFeature.repositoryType();

    public static final RepositoryType AVERAGINGWEIGHTINGMETHODENUM = AveragingWeightingMethodEnum.repositoryType();

    public static final RepositoryType BANKHOLIDAYTREATMENTENUM = BankHolidayTreatmentEnum.repositoryType();

    public static final RepositoryType BARRIER = Barrier.repositoryType();

    public static final RepositoryType BASKET = Basket.repositoryType();

    public static final RepositoryType BASKETCONSTITUENT = BasketConstituent.repositoryType();

    public static final RepositoryType BASKETREFERENCEINFORMATION = BasketReferenceInformation.repositoryType();

    public static final RepositoryType BILLINGINSTRUCTION = BillingInstruction.repositoryType();

    public static final RepositoryType BILLINGRECORD = BillingRecord.repositoryType();

    public static final RepositoryType BILLINGRECORDINSTRUCTION = BillingRecordInstruction.repositoryType();

    public static final RepositoryType BILLINGSUMMARY = BillingSummary.repositoryType();

    public static final RepositoryType BILLINGSUMMARYINSTRUCTION = BillingSummaryInstruction.repositoryType();

    public static final RepositoryType BONDREFERENCE = BondReference.repositoryType();

    public static final RepositoryType BOUNDEDCORRELATION = BoundedCorrelation.repositoryType();

    public static final RepositoryType BOUNDEDVARIANCE = BoundedVariance.repositoryType();

    public static final RepositoryType BUSINESSCENTERENUM = BusinessCenterEnum.repositoryType();

    public static final RepositoryType BUSINESSCENTERS = BusinessCenters.repositoryType();

    public static final RepositoryType BUSINESSCENTERTIME = BusinessCenterTime.repositoryType();

    public static final RepositoryType BUSINESSDATERANGE = BusinessDateRange.repositoryType();

    public static final RepositoryType BUSINESSDAYADJUSTMENTS = BusinessDayAdjustments.repositoryType();

    public static final RepositoryType BUSINESSDAYCONVENTIONENUM = BusinessDayConventionEnum.repositoryType();

    public static final RepositoryType BUSINESSEVENT = BusinessEvent.repositoryType();

    public static final RepositoryType BUSINESSUNIT = BusinessUnit.repositoryType();

    public static final RepositoryType BUYERSELLER = BuyerSeller.repositoryType();

    public static final RepositoryType BUYR = Buyr.repositoryType();

    public static final RepositoryType CALCULATEDRATEDETAILS = CalculatedRateDetails.repositoryType();

    public static final RepositoryType CALCULATEDRATEOBSERVATIONDATESANDWEIGHTS = CalculatedRateObservationDatesAndWeights.repositoryType();

    public static final RepositoryType CALCULATEDRATEOBSERVATIONS = CalculatedRateObservations.repositoryType();

    public static final RepositoryType CALCULATETRANSFERINSTRUCTION = CalculateTransferInstruction.repositoryType();

    public static final RepositoryType CALCULATIONAGENT = CalculationAgent.repositoryType();

    public static final RepositoryType CALCULATIONFREQUENCY = CalculationFrequency.repositoryType();

    public static final RepositoryType CALCULATIONMETHODENUM = CalculationMethodEnum.repositoryType();

    public static final RepositoryType CALCULATIONPERIOD = CalculationPeriod.repositoryType();

    public static final RepositoryType CALCULATIONPERIODBASE = CalculationPeriodBase.repositoryType();

    public static final RepositoryType CALCULATIONPERIODDATA = CalculationPeriodData.repositoryType();

    public static final RepositoryType CALCULATIONPERIODDATES = CalculationPeriodDates.repositoryType();

    public static final RepositoryType CALCULATIONPERIODFREQUENCY = CalculationPeriodFrequency.repositoryType();

    public static final RepositoryType CALCULATIONSCHEDULE = CalculationSchedule.repositoryType();

    public static final RepositoryType CALCULATIONSCHEDULEDELIVERYPERIODS = CalculationScheduleDeliveryPeriods.repositoryType();

    public static final RepositoryType CALCULATIONSHIFTMETHODENUM = CalculationShiftMethodEnum.repositoryType();

    public static final RepositoryType CALENDARSPREAD = CalendarSpread.repositoryType();

    public static final RepositoryType CALLINGPARTYENUM = CallingPartyEnum.repositoryType();

    public static final RepositoryType CALLTYPEENUM = CallTypeEnum.repositoryType();

    public static final RepositoryType CANCELABLEPROVISION = CancelableProvision.repositoryType();

    public static final RepositoryType CANCELABLEPROVISIONADJUSTEDDATES = CancelableProvisionAdjustedDates.repositoryType();

    public static final RepositoryType CANCELLATIONEVENT = CancellationEvent.repositoryType();

    public static final RepositoryType CAPACITYUNITENUM = CapacityUnitEnum.repositoryType();

    public static final RepositoryType CASH = Cash.repositoryType();

    public static final RepositoryType CASHCOLLATERALVALUATIONMETHOD = CashCollateralValuationMethod.repositoryType();

    public static final RepositoryType CASHFLOW = Cashflow.repositoryType();

    public static final RepositoryType CASHFLOWREPRESENTATION = CashflowRepresentation.repositoryType();

    public static final RepositoryType CASHFLOWTYPE = CashflowType.repositoryType();

    public static final RepositoryType CASHPRICE = CashPrice.repositoryType();

    public static final RepositoryType CASHPRICETYPEENUM = CashPriceTypeEnum.repositoryType();

    public static final RepositoryType CASHSETTLEMENTMETHODENUM = CashSettlementMethodEnum.repositoryType();

    public static final RepositoryType CASHSETTLEMENTTERMS = CashSettlementTerms.repositoryType();

    public static final RepositoryType CHECKELIGIBILITYRESULT = CheckEligibilityResult.repositoryType();

    public static final RepositoryType CLAUSE = Clause.repositoryType();

    public static final RepositoryType CLEARINGINSTRUCTION = ClearingInstruction.repositoryType();

    public static final RepositoryType CLOSEDSTATE = ClosedState.repositoryType();

    public static final RepositoryType CLOSEDSTATEENUM = ClosedStateEnum.repositoryType();

    public static final RepositoryType COLLATERAL = Collateral.repositoryType();

    public static final RepositoryType COLLATERALAGREEMENTFLOATINGRATE = CollateralAgreementFloatingRate.repositoryType();

    public static final RepositoryType COLLATERALBALANCE = CollateralBalance.repositoryType();

    public static final RepositoryType COLLATERALCRITERIA = CollateralCriteria.repositoryType();

    public static final RepositoryType COLLATERALCRITERIABASE = CollateralCriteriaBase.repositoryType();

    public static final RepositoryType COLLATERALINTERESTCALCULATIONPARAMETERS = CollateralInterestCalculationParameters.repositoryType();

    public static final RepositoryType COLLATERALINTERESTHANDLINGENUM = CollateralInterestHandlingEnum.repositoryType();

    public static final RepositoryType COLLATERALINTERESTHANDLINGPARAMETERS = CollateralInterestHandlingParameters.repositoryType();

    public static final RepositoryType COLLATERALINTERESTNOTIFICATION = CollateralInterestNotification.repositoryType();

    public static final RepositoryType COLLATERALINTERESTPARAMETERS = CollateralInterestParameters.repositoryType();

    public static final RepositoryType COLLATERALISSUERTYPE = CollateralIssuerType.repositoryType();

    public static final RepositoryType COLLATERALMARGINTYPEENUM = CollateralMarginTypeEnum.repositoryType();

    public static final RepositoryType COLLATERALPORTFOLIO = CollateralPortfolio.repositoryType();

    public static final RepositoryType COLLATERALPOSITION = CollateralPosition.repositoryType();

    public static final RepositoryType COLLATERALPROVISIONS = CollateralProvisions.repositoryType();

    public static final RepositoryType COLLATERALSTATUSENUM = CollateralStatusEnum.repositoryType();

    public static final RepositoryType COLLATERALTAXONOMY = CollateralTaxonomy.repositoryType();

    public static final RepositoryType COLLATERALTAXONOMYVALUE = CollateralTaxonomyValue.repositoryType();

    public static final RepositoryType COLLATERALTRANSFERAGREEMENTELECTIONS = CollateralTransferAgreementElections.repositoryType();

    public static final RepositoryType COLLATERALTREATMENT = CollateralTreatment.repositoryType();

    public static final RepositoryType COLLATERALTYPEENUM = CollateralTypeEnum.repositoryType();

    public static final RepositoryType COLLATERALVALUATIONTREATMENT = CollateralValuationTreatment.repositoryType();

    public static final RepositoryType COMMODITY = Commodity.repositoryType();

    public static final RepositoryType COMMODITYBUSINESSCALENDARENUM = CommodityBusinessCalendarEnum.repositoryType();

    public static final RepositoryType COMMODITYINFORMATIONPUBLISHERENUM = CommodityInformationPublisherEnum.repositoryType();

    public static final RepositoryType COMMODITYLOCATIONIDENTIFIERTYPEENUM = CommodityLocationIdentifierTypeEnum.repositoryType();

    public static final RepositoryType COMMODITYPAYOUT = CommodityPayout.repositoryType();

    public static final RepositoryType COMMODITYPRICERETURNTERMS = CommodityPriceReturnTerms.repositoryType();

    public static final RepositoryType COMMODITYPRODUCTDEFINITION = CommodityProductDefinition.repositoryType();

    public static final RepositoryType COMMODITYREFERENCEFRAMEWORK = CommodityReferenceFramework.repositoryType();

    public static final RepositoryType COMMODITYREFERENCEPRICEENUM = CommodityReferencePriceEnum.repositoryType();

    public static final RepositoryType COMPAREOP = CompareOp.repositoryType();

    public static final RepositoryType COMPOSITE = Composite.repositoryType();

    public static final RepositoryType COMPOUNDINGMETHODENUM = CompoundingMethodEnum.repositoryType();

    public static final RepositoryType COMPOUNDINGTYPEENUM = CompoundingTypeEnum.repositoryType();

    public static final RepositoryType COMPUTEDAMOUNT = ComputedAmount.repositoryType();

    public static final RepositoryType CONCENTRATIONLIMIT = ConcentrationLimit.repositoryType();

    public static final RepositoryType CONCENTRATIONLIMITCRITERIA = ConcentrationLimitCriteria.repositoryType();

    public static final RepositoryType CONCENTRATIONLIMITTYPEENUM = ConcentrationLimitTypeEnum.repositoryType();

    public static final RepositoryType CONFIRMATIONSTATUSENUM = ConfirmationStatusEnum.repositoryType();

    public static final RepositoryType CONSTITUENTWEIGHT = ConstituentWeight.repositoryType();

    public static final RepositoryType CONTACTELECTION = ContactElection.repositoryType();

    public static final RepositoryType CONTACTINFORMATION = ContactInformation.repositoryType();

    public static final RepositoryType CONTRACTBASE = ContractBase.repositoryType();

    public static final RepositoryType CONTRACTDETAILS = ContractDetails.repositoryType();

    public static final RepositoryType CONTRACTFORMATIONINSTRUCTION = ContractFormationInstruction.repositoryType();

    public static final RepositoryType CONTRACTUALDEFINITIONSENUM = ContractualDefinitionsEnum.repositoryType();

    public static final RepositoryType CONTRACTUALMATRIX = ContractualMatrix.repositoryType();

    public static final RepositoryType CONTRACTUALSUPPLEMENTTYPEENUM = ContractualSupplementTypeEnum.repositoryType();

    public static final RepositoryType CONTRACTUALTERMSSUPPLEMENT = ContractualTermsSupplement.repositoryType();

    public static final RepositoryType CORPORATEACTION = CorporateAction.repositoryType();

    public static final RepositoryType CORPORATEACTIONTYPEENUM = CorporateActionTypeEnum.repositoryType();

    public static final RepositoryType CORRELATIONRETURNTERMS = CorrelationReturnTerms.repositoryType();

    public static final RepositoryType COUNTERPARTY = Counterparty.repositoryType();

    public static final RepositoryType COUNTERPARTYOWNISSUEPERMITTED = CounterpartyOwnIssuePermitted.repositoryType();

    public static final RepositoryType COUNTERPARTYPOSITION = CounterpartyPosition.repositoryType();

    public static final RepositoryType COUNTERPARTYPOSITIONBUSINESSEVENT = CounterpartyPositionBusinessEvent.repositoryType();

    public static final RepositoryType COUNTERPARTYPOSITIONSTATE = CounterpartyPositionState.repositoryType();

    public static final RepositoryType COUNTERPARTYROLEENUM = CounterpartyRoleEnum.repositoryType();

    public static final RepositoryType CREDITDEFAULTPAYOUT = CreditDefaultPayout.repositoryType();

    public static final RepositoryType CREDITEVENT = CreditEvent.repositoryType();

    public static final RepositoryType CREDITEVENTNOTICE = CreditEventNotice.repositoryType();

    public static final RepositoryType CREDITEVENTS = CreditEvents.repositoryType();

    public static final RepositoryType CREDITEVENTTYPEENUM = CreditEventTypeEnum.repositoryType();

    public static final RepositoryType CREDITINDEX = CreditIndex.repositoryType();

    public static final RepositoryType CREDITLIMITINFORMATION = CreditLimitInformation.repositoryType();

    public static final RepositoryType CREDITLIMITTYPEENUM = CreditLimitTypeEnum.repositoryType();

    public static final RepositoryType CREDITLIMITUTILISATION = CreditLimitUtilisation.repositoryType();

    public static final RepositoryType CREDITLIMITUTILISATIONPOSITION = CreditLimitUtilisationPosition.repositoryType();

    public static final RepositoryType CREDITNOTATION = CreditNotation.repositoryType();

    public static final RepositoryType CREDITNOTATIONBOUNDARYENUM = CreditNotationBoundaryEnum.repositoryType();

    public static final RepositoryType CREDITNOTATIONMISMATCHRESOLUTIONENUM = CreditNotationMismatchResolutionEnum.repositoryType();

    public static final RepositoryType CREDITNOTATIONS = CreditNotations.repositoryType();

    public static final RepositoryType CREDITRATINGAGENCYENUM = CreditRatingAgencyEnum.repositoryType();

    public static final RepositoryType CREDITRATINGCREDITWATCHENUM = CreditRatingCreditWatchEnum.repositoryType();

    public static final RepositoryType CREDITRATINGDEBT = CreditRatingDebt.repositoryType();

    public static final RepositoryType CREDITRATINGOUTLOOKENUM = CreditRatingOutlookEnum.repositoryType();

    public static final RepositoryType CREDITRISKENUM = CreditRiskEnum.repositoryType();

    public static final RepositoryType CREDITSENIORITYENUM = CreditSeniorityEnum.repositoryType();

    public static final RepositoryType CREDITSUPPORTAGREEMENTELECTIONS = CreditSupportAgreementElections.repositoryType();

    public static final RepositoryType CREDITSUPPORTAGREEMENTTYPEENUM = CreditSupportAgreementTypeEnum.repositoryType();

    public static final RepositoryType CREDITSUPPORTDOCUMENTTERMSENUM = CreditSupportDocumentTermsEnum.repositoryType();

    public static final RepositoryType CREDITSUPPORTPROVIDERTERMSENUM = CreditSupportProviderTermsEnum.repositoryType();

    public static final RepositoryType CSATYPEENUM = CsaTypeEnum.repositoryType();

    public static final RepositoryType CURRENCYCODEENUM = CurrencyCodeEnum.repositoryType();

    public static final RepositoryType CURVE = Curve.repositoryType();

    public static final RepositoryType CUSTOMISABLEOFFSET = CustomisableOffset.repositoryType();

    public static final RepositoryType CUSTOMISEDWORKFLOW = CustomisedWorkflow.repositoryType();

    public static final RepositoryType DATEDVALUE = DatedValue.repositoryType();

    public static final RepositoryType DATELIST = DateList.repositoryType();

    public static final RepositoryType DATERANGE = DateRange.repositoryType();

    public static final RepositoryType DATERELATIVETOCALCULATIONPERIODDATES = DateRelativeToCalculationPeriodDates.repositoryType();

    public static final RepositoryType DATERELATIVETOPAYMENTDATES = DateRelativeToPaymentDates.repositoryType();

    public static final RepositoryType DATERELATIVETOVALUATIONDATES = DateRelativeToValuationDates.repositoryType();

    public static final RepositoryType DATETIMELIST = DateTimeList.repositoryType();

    public static final RepositoryType DAYCOUNTFRACTIONENUM = DayCountFractionEnum.repositoryType();

    public static final RepositoryType DAYDISTRIBUTIONENUM = DayDistributionEnum.repositoryType();

    public static final RepositoryType DAYOFWEEKENUM = DayOfWeekEnum.repositoryType();

    public static final RepositoryType DAYTYPEENUM = DayTypeEnum.repositoryType();

    public static final RepositoryType DEBTCLASSENUM = DebtClassEnum.repositoryType();

    public static final RepositoryType DEBTECONOMICS = DebtEconomics.repositoryType();

    public static final RepositoryType DEBTINTERESTENUM = DebtInterestEnum.repositoryType();

    public static final RepositoryType DEBTPRINCIPALENUM = DebtPrincipalEnum.repositoryType();

    public static final RepositoryType DEBTSENIORITYENUM = DebtSeniorityEnum.repositoryType();

    public static final RepositoryType DEBTTYPE = DebtType.repositoryType();

    public static final RepositoryType DELIVERABLEOBLIGATIONS = DeliverableObligations.repositoryType();

    public static final RepositoryType DELIVERYAMOUNT = DeliveryAmount.repositoryType();

    public static final RepositoryType DELIVERYAMOUNTELECTIONENUM = DeliveryAmountElectionEnum.repositoryType();

    public static final RepositoryType DELIVERYDATEPARAMETERS = DeliveryDateParameters.repositoryType();

    public static final RepositoryType DELIVERYMETHODENUM = DeliveryMethodEnum.repositoryType();

    public static final RepositoryType DELIVERYNEARBYTYPEENUM = DeliveryNearbyTypeEnum.repositoryType();

    public static final RepositoryType DERIVINSTRMATTRBTS = DerivInstrmAttrbts.repositoryType();

    public static final RepositoryType DETERMINATIONMETHODENUM = DeterminationMethodEnum.repositoryType();

    public static final RepositoryType DETERMINATIONMETHODOLOGY = DeterminationMethodology.repositoryType();

    public static final RepositoryType DETERMINATIONROLESANDTERMS = DeterminationRolesAndTerms.repositoryType();

    public static final RepositoryType DIGITALASSET = DigitalAsset.repositoryType();

    public static final RepositoryType DISCOUNTINGMETHOD = DiscountingMethod.repositoryType();

    public static final RepositoryType DISCOUNTINGTYPEENUM = DiscountingTypeEnum.repositoryType();

    public static final RepositoryType DISTRIBUTIONANDINTERESTPAYMENT = DistributionAndInterestPayment.repositoryType();

    public static final RepositoryType DIVIDENDAMOUNTTYPEENUM = DividendAmountTypeEnum.repositoryType();

    public static final RepositoryType DIVIDENDAPPLICABILITY = DividendApplicability.repositoryType();

    public static final RepositoryType DIVIDENDCOMPOSITIONENUM = DividendCompositionEnum.repositoryType();

    public static final RepositoryType DIVIDENDCURRENCY = DividendCurrency.repositoryType();

    public static final RepositoryType DIVIDENDDATEREFERENCE = DividendDateReference.repositoryType();

    public static final RepositoryType DIVIDENDDATEREFERENCEENUM = DividendDateReferenceEnum.repositoryType();

    public static final RepositoryType DIVIDENDENTITLEMENTENUM = DividendEntitlementEnum.repositoryType();

    public static final RepositoryType DIVIDENDPAYMENTDATE = DividendPaymentDate.repositoryType();

    public static final RepositoryType DIVIDENDPAYOUTRATIO = DividendPayoutRatio.repositoryType();

    public static final RepositoryType DIVIDENDPERIOD = DividendPeriod.repositoryType();

    public static final RepositoryType DIVIDENDPERIODENUM = DividendPeriodEnum.repositoryType();

    public static final RepositoryType DIVIDENDRETURNTERMS = DividendReturnTerms.repositoryType();

    public static final RepositoryType DIVIDENDTERMS = DividendTerms.repositoryType();

    public static final RepositoryType DOCUMENT = Document.repositoryType();

    public static final RepositoryType DOMESTICCURRENCYISSUED = DomesticCurrencyIssued.repositoryType();

    public static final RepositoryType EARLYTERMINATIONEVENT = EarlyTerminationEvent.repositoryType();

    public static final RepositoryType EARLYTERMINATIONPROVISION = EarlyTerminationProvision.repositoryType();

    public static final RepositoryType ECONOMICTERMS = EconomicTerms.repositoryType();

    public static final RepositoryType ELIGIBILITYQUERY = EligibilityQuery.repositoryType();

    public static final RepositoryType ELIGIBLECOLLATERALCRITERIA = EligibleCollateralCriteria.repositoryType();

    public static final RepositoryType ELIGIBLECOLLATERALSPECIFICATION = EligibleCollateralSpecification.repositoryType();

    public static final RepositoryType ELIGIBLECOLLATERALSPECIFICATIONINSTRUCTION = EligibleCollateralSpecificationInstruction.repositoryType();

    public static final RepositoryType ENTITYTYPEENUM = EntityTypeEnum.repositoryType();

    public static final RepositoryType EQUITYADDITIONALTERMS = EquityAdditionalTerms.repositoryType();

    public static final RepositoryType EQUITYCORPORATEEVENTS = EquityCorporateEvents.repositoryType();

    public static final RepositoryType EQUITYINDEX = EquityIndex.repositoryType();

    public static final RepositoryType EQUITYMASTERCONFIRMATION = EquityMasterConfirmation.repositoryType();

    public static final RepositoryType EQUITYSWAPMASTERCONFIRMATION2018 = EquitySwapMasterConfirmation2018.repositoryType();

    public static final RepositoryType EQUITYTYPEENUM = EquityTypeEnum.repositoryType();

    public static final RepositoryType EQUITYUNDERLIERPROVISIONS = EquityUnderlierProvisions.repositoryType();

    public static final RepositoryType EU_EMIR_ELIGIBLECOLLATERALENUM = EUEMIREligibleCollateralEnum.repositoryType();

    public static final RepositoryType EVENTINSTRUCTION = EventInstruction.repositoryType();

    public static final RepositoryType EVENTINTENTENUM = EventIntentEnum.repositoryType();

    public static final RepositoryType EVENTTIMESTAMP = EventTimestamp.repositoryType();

    public static final RepositoryType EVENTTIMESTAMPQUALIFICATIONENUM = EventTimestampQualificationEnum.repositoryType();

    public static final RepositoryType EVERGREENPROVISION = EvergreenProvision.repositoryType();

    public static final RepositoryType EXCTGPRSN = ExctgPrsn.repositoryType();

    public static final RepositoryType EXECUTIONDETAILS = ExecutionDetails.repositoryType();

    public static final RepositoryType EXECUTIONINSTRUCTION = ExecutionInstruction.repositoryType();

    public static final RepositoryType EXECUTIONLOCATIONENUM = ExecutionLocationEnum.repositoryType();

    public static final RepositoryType EXECUTIONTYPEENUM = ExecutionTypeEnum.repositoryType();

    public static final RepositoryType EXERCISEEVENT = ExerciseEvent.repositoryType();

    public static final RepositoryType EXERCISEFEE = ExerciseFee.repositoryType();

    public static final RepositoryType EXERCISEFEESCHEDULE = ExerciseFeeSchedule.repositoryType();

    public static final RepositoryType EXERCISEINSTRUCTION = ExerciseInstruction.repositoryType();

    public static final RepositoryType EXERCISENOTICE = ExerciseNotice.repositoryType();

    public static final RepositoryType EXERCISENOTICEGIVERENUM = ExerciseNoticeGiverEnum.repositoryType();

    public static final RepositoryType EXERCISEPERIOD = ExercisePeriod.repositoryType();

    public static final RepositoryType EXERCISEPROCEDURE = ExerciseProcedure.repositoryType();

    public static final RepositoryType EXERCISETERMS = ExerciseTerms.repositoryType();

    public static final RepositoryType EXPIRATIONTIMETYPEENUM = ExpirationTimeTypeEnum.repositoryType();

    public static final RepositoryType EXPOSURE = Exposure.repositoryType();

    public static final RepositoryType EXTENDIBLEPROVISION = ExtendibleProvision.repositoryType();

    public static final RepositoryType EXTENDIBLEPROVISIONADJUSTEDDATES = ExtendibleProvisionAdjustedDates.repositoryType();

    public static final RepositoryType EXTENSIONEVENT = ExtensionEvent.repositoryType();

    public static final RepositoryType EXTRAORDINARYEVENTS = ExtraordinaryEvents.repositoryType();

    public static final RepositoryType FAILURETOPAY = FailureToPay.repositoryType();

    public static final RepositoryType FALLBACKRATEPARAMETERS = FallbackRateParameters.repositoryType();

    public static final RepositoryType FALLBACKREFERENCEPRICE = FallbackReferencePrice.repositoryType();

    public static final RepositoryType FEATUREPAYMENT = FeaturePayment.repositoryType();

    public static final RepositoryType FEETYPEENUM = FeeTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAACCOUNTTYPEENUM = FieldWithMetaAccountTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAASSETCLASSENUM = FieldWithMetaAssetClassEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETABASKETCONSTITUENT = FieldWithMetaBasketConstituent.repositoryType();

    public static final RepositoryType FIELDWITHMETABUSINESSCENTERENUM = FieldWithMetaBusinessCenterEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACOMMODITYBUSINESSCALENDARENUM = FieldWithMetaCommodityBusinessCalendarEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACOMMODITYREFERENCEPRICEENUM = FieldWithMetaCommodityReferencePriceEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACONTRACTUALDEFINITIONSENUM = FieldWithMetaContractualDefinitionsEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACONTRACTUALSUPPLEMENTTYPEENUM = FieldWithMetaContractualSupplementTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACREDITLIMITTYPEENUM = FieldWithMetaCreditLimitTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETACREDITNOTATION = FieldWithMetaCreditNotation.repositoryType();

    public static final RepositoryType FIELDWITHMETACREDITSUPPORTAGREEMENTTYPEENUM = FieldWithMetaCreditSupportAgreementTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETADAYCOUNTFRACTIONENUM = FieldWithMetaDayCountFractionEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAENTITYTYPEENUM = FieldWithMetaEntityTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAFLOATINGRATEINDEXENUM = FieldWithMetaFloatingRateIndexEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAGOVERNINGLAWENUM = FieldWithMetaGoverningLawEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAIDENTIFIER = FieldWithMetaIdentifier.repositoryType();

    public static final RepositoryType FIELDWITHMETAINDEXANNEXSOURCEENUM = FieldWithMetaIndexAnnexSourceEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAINFLATIONRATEINDEXENUM = FieldWithMetaInflationRateIndexEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAINFORMATIONPROVIDERENUM = FieldWithMetaInformationProviderEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAINTERESTRATEINDEX = FieldWithMetaInterestRateIndex.repositoryType();

    public static final RepositoryType FIELDWITHMETAINTERPOLATIONMETHODENUM = FieldWithMetaInterpolationMethodEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETALIMITLEVELENUM = FieldWithMetaLimitLevelEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMARKETDISRUPTIONENUM = FieldWithMetaMarketDisruptionEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMASTERAGREEMENTTYPEENUM = FieldWithMetaMasterAgreementTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMASTERCONFIRMATIONANNEXTYPEENUM = FieldWithMetaMasterConfirmationAnnexTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMASTERCONFIRMATIONTYPEENUM = FieldWithMetaMasterConfirmationTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMATRIXTERMENUM = FieldWithMetaMatrixTermEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETAMATRIXTYPEENUM = FieldWithMetaMatrixTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETANATURALPERSONROLEENUM = FieldWithMetaNaturalPersonRoleEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETANONNEGATIVEQUANTITYSCHEDULE = FieldWithMetaNonNegativeQuantitySchedule.repositoryType();

    public static final RepositoryType FIELDWITHMETAOBSERVABLE = FieldWithMetaObservable.repositoryType();

    public static final RepositoryType FIELDWITHMETAPERSONIDENTIFIER = FieldWithMetaPersonIdentifier.repositoryType();

    public static final RepositoryType FIELDWITHMETAPRICESCHEDULE = FieldWithMetaPriceSchedule.repositoryType();

    public static final RepositoryType FIELDWITHMETAQUOTEDCURRENCYPAIR = FieldWithMetaQuotedCurrencyPair.repositoryType();

    public static final RepositoryType FIELDWITHMETARESOURCETYPEENUM = FieldWithMetaResourceTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETARESTRUCTURINGENUM = FieldWithMetaRestructuringEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETASETTLEDENTITYMATRIXSOURCEENUM = FieldWithMetaSettledEntityMatrixSourceEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETASETTLEMENTRATEOPTIONENUM = FieldWithMetaSettlementRateOptionEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETASPREADSCHEDULETYPEENUM = FieldWithMetaSpreadScheduleTypeEnum.repositoryType();

    public static final RepositoryType FIELDWITHMETASTRING = FieldWithMetaString.repositoryType();

    public static final RepositoryType FIELDWITHMETATIMEZONE = FieldWithMetaTimeZone.repositoryType();

    public static final RepositoryType FINALCALCULATIONPERIODDATEADJUSTMENT = FinalCalculationPeriodDateAdjustment.repositoryType();

    public static final RepositoryType FINALPRINCIPALEXCHANGECALCULATIONENUM = FinalPrincipalExchangeCalculationEnum.repositoryType();

    public static final RepositoryType FINANCIALUNITENUM = FinancialUnitEnum.repositoryType();

    public static final RepositoryType FININSTRM = FinInstrm.repositoryType();

    public static final RepositoryType FININSTRMGNLATTRBTS = FinInstrmGnlAttrbts.repositoryType();

    public static final RepositoryType FININSTRMRPTGTXRPT = FinInstrmRptgTxRpt.repositoryType();

    public static final RepositoryType FIXEDAMOUNTCALCULATIONDETAILS = FixedAmountCalculationDetails.repositoryType();

    public static final RepositoryType FIXEDPRICE = FixedPrice.repositoryType();

    public static final RepositoryType FIXEDPRICEPAYOUT = FixedPricePayout.repositoryType();

    public static final RepositoryType FIXEDRATESPECIFICATION = FixedRateSpecification.repositoryType();

    public static final RepositoryType FLOATINGAMOUNTCALCULATIONDETAILS = FloatingAmountCalculationDetails.repositoryType();

    public static final RepositoryType FLOATINGAMOUNTEVENTS = FloatingAmountEvents.repositoryType();

    public static final RepositoryType FLOATINGAMOUNTPROVISIONS = FloatingAmountProvisions.repositoryType();

    public static final RepositoryType FLOATINGRATE = FloatingRate.repositoryType();

    public static final RepositoryType FLOATINGRATEBASE = FloatingRateBase.repositoryType();

    public static final RepositoryType FLOATINGRATECALCULATIONPARAMETERS = FloatingRateCalculationParameters.repositoryType();

    public static final RepositoryType FLOATINGRATEDEFINITION = FloatingRateDefinition.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEX = FloatingRateIndex.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXCALCULATIONDEFAULTS = FloatingRateIndexCalculationDefaults.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXCALCULATIONMETHODENUM = FloatingRateIndexCalculationMethodEnum.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXCATEGORYENUM = FloatingRateIndexCategoryEnum.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXDEFINITION = FloatingRateIndexDefinition.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXENUM = FloatingRateIndexEnum.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXIDENTIFICATION = FloatingRateIndexIdentification.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXPROCESSINGTYPEENUM = FloatingRateIndexProcessingTypeEnum.repositoryType();

    public static final RepositoryType FLOATINGRATEINDEXSTYLEENUM = FloatingRateIndexStyleEnum.repositoryType();

    public static final RepositoryType FLOATINGRATEPROCESSINGDETAILS = FloatingRateProcessingDetails.repositoryType();

    public static final RepositoryType FLOATINGRATEPROCESSINGPARAMETERS = FloatingRateProcessingParameters.repositoryType();

    public static final RepositoryType FLOATINGRATESETTINGDETAILS = FloatingRateSettingDetails.repositoryType();

    public static final RepositoryType FLOATINGRATESPECIFICATION = FloatingRateSpecification.repositoryType();

    public static final RepositoryType FOREIGNEXCHANGE = ForeignExchange.repositoryType();

    public static final RepositoryType FOREIGNEXCHANGERATEINDEX = ForeignExchangeRateIndex.repositoryType();

    public static final RepositoryType FPVFINALPRICEELECTIONFALLBACKENUM = FPVFinalPriceElectionFallbackEnum.repositoryType();

    public static final RepositoryType FREQUENCY = Frequency.repositoryType();

    public static final RepositoryType FUNDPRODUCTTYPEENUM = FundProductTypeEnum.repositoryType();

    public static final RepositoryType FUTUREVALUEAMOUNT = FutureValueAmount.repositoryType();

    public static final RepositoryType FXADDITIONALTERMS = FxAdditionalTerms.repositoryType();

    public static final RepositoryType FXFEATURE = FxFeature.repositoryType();

    public static final RepositoryType FXFIXINGDATE = FxFixingDate.repositoryType();

    public static final RepositoryType FXINFORMATIONSOURCE = FxInformationSource.repositoryType();

    public static final RepositoryType FXLINKEDNOTIONALAMOUNT = FxLinkedNotionalAmount.repositoryType();

    public static final RepositoryType FXLINKEDNOTIONALSCHEDULE = FxLinkedNotionalSchedule.repositoryType();

    public static final RepositoryType FXRATE = FxRate.repositoryType();

    public static final RepositoryType FXRATESOURCEFIXING = FxRateSourceFixing.repositoryType();

    public static final RepositoryType FXSETTLEMENTRATESOURCE = FxSettlementRateSource.repositoryType();

    public static final RepositoryType FXSPOTRATESOURCE = FxSpotRateSource.repositoryType();

    public static final RepositoryType GENERALTERMS = GeneralTerms.repositoryType();

    public static final RepositoryType GOVERNINGLAWENUM = GoverningLawEnum.repositoryType();

    public static final RepositoryType GRACEPERIODEXTENSION = GracePeriodExtension.repositoryType();

    public static final RepositoryType HAIRCUTINDICATORENUM = HaircutIndicatorEnum.repositoryType();

    public static final RepositoryType ID = Id.repositoryType();

    public static final RepositoryType IDENTIFIEDLIST = IdentifiedList.repositoryType();

    public static final RepositoryType IDENTIFIER = Identifier.repositoryType();

    public static final RepositoryType INDEPENDENTAMOUNT = IndependentAmount.repositoryType();

    public static final RepositoryType INDEX = Index.repositoryType();

    public static final RepositoryType INDEXADJUSTMENTEVENTS = IndexAdjustmentEvents.repositoryType();

    public static final RepositoryType INDEXANNEXSOURCEENUM = IndexAnnexSourceEnum.repositoryType();

    public static final RepositoryType INDEXBASE = IndexBase.repositoryType();

    public static final RepositoryType INDEXEVENTCONSEQUENCEENUM = IndexEventConsequenceEnum.repositoryType();

    public static final RepositoryType INDEXTRANSITIONINSTRUCTION = IndexTransitionInstruction.repositoryType();

    public static final RepositoryType INDX = Indx.repositoryType();

    public static final RepositoryType INFLATIONCALCULATIONMETHODENUM = InflationCalculationMethodEnum.repositoryType();

    public static final RepositoryType INFLATIONCALCULATIONSTYLEENUM = InflationCalculationStyleEnum.repositoryType();

    public static final RepositoryType INFLATIONINDEX = InflationIndex.repositoryType();

    public static final RepositoryType INFLATIONRATEINDEXENUM = InflationRateIndexEnum.repositoryType();

    public static final RepositoryType INFLATIONRATESPECIFICATION = InflationRateSpecification.repositoryType();

    public static final RepositoryType INFORMATIONPROVIDERENUM = InformationProviderEnum.repositoryType();

    public static final RepositoryType INFORMATIONSOURCE = InformationSource.repositoryType();

    public static final RepositoryType INITIALFIXINGDATE = InitialFixingDate.repositoryType();

    public static final RepositoryType INSTRUCTION = Instruction.repositoryType();

    public static final RepositoryType INSTRUCTIONFUNCTIONENUM = InstructionFunctionEnum.repositoryType();

    public static final RepositoryType INSTRUMENT = Instrument.repositoryType();

    public static final RepositoryType INSTRUMENTBASE = InstrumentBase.repositoryType();

    public static final RepositoryType INSTRUMENTTYPEENUM = InstrumentTypeEnum.repositoryType();

    public static final RepositoryType INTERESTAMOUNTAPPLICATION = InterestAmountApplication.repositoryType();

    public static final RepositoryType INTERESTRATECURVE = InterestRateCurve.repositoryType();

    public static final RepositoryType INTERESTRATEINDEX = InterestRateIndex.repositoryType();

    public static final RepositoryType INTERESTRATEPAYOUT = InterestRatePayout.repositoryType();

    public static final RepositoryType INTERESTSHORTFALL = InterestShortFall.repositoryType();

    public static final RepositoryType INTERESTSHORTFALLCAPENUM = InterestShortfallCapEnum.repositoryType();

    public static final RepositoryType INTERPOLATIONMETHODENUM = InterpolationMethodEnum.repositoryType();

    public static final RepositoryType INVENTORY = Inventory.repositoryType();

    public static final RepositoryType INVENTORYRECORD = InventoryRecord.repositoryType();

    public static final RepositoryType INVSTMTDCSNPRSN = InvstmtDcsnPrsn.repositoryType();

    public static final RepositoryType ISOCOUNTRYCODEENUM = ISOCountryCodeEnum.repositoryType();

    public static final RepositoryType ISOCURRENCYCODEENUM = ISOCurrencyCodeEnum.repositoryType();

    public static final RepositoryType ISSUERAGENCYRATING = IssuerAgencyRating.repositoryType();

    public static final RepositoryType ISSUERCOUNTRYOFORIGIN = IssuerCountryOfOrigin.repositoryType();

    public static final RepositoryType ISSUERNAME = IssuerName.repositoryType();

    public static final RepositoryType ISSUERTYPEENUM = IssuerTypeEnum.repositoryType();

    public static final RepositoryType KEY = Key.repositoryType();

    public static final RepositoryType KNOCK = Knock.repositoryType();

    public static final RepositoryType LAG = Lag.repositoryType();

    public static final RepositoryType LEGALAGREEMENT = LegalAgreement.repositoryType();

    public static final RepositoryType LEGALAGREEMENTBASE = LegalAgreementBase.repositoryType();

    public static final RepositoryType LEGALAGREEMENTIDENTIFICATION = LegalAgreementIdentification.repositoryType();

    public static final RepositoryType LEGALAGREEMENTPUBLISHERENUM = LegalAgreementPublisherEnum.repositoryType();

    public static final RepositoryType LEGALAGREEMENTTYPEENUM = LegalAgreementTypeEnum.repositoryType();

    public static final RepositoryType LEGALENTITY = LegalEntity.repositoryType();

    public static final RepositoryType LENGTHUNITENUM = LengthUnitEnum.repositoryType();

    public static final RepositoryType LIMITAPPLICABLE = LimitApplicable.repositoryType();

    public static final RepositoryType LIMITAPPLICABLEEXTENDED = LimitApplicableExtended.repositoryType();

    public static final RepositoryType LIMITLEVELENUM = LimitLevelEnum.repositoryType();

    public static final RepositoryType LINEAGE = Lineage.repositoryType();

    public static final RepositoryType LISTEDDERIVATIVE = ListedDerivative.repositoryType();

    public static final RepositoryType LISTINGEXCHANGE = ListingExchange.repositoryType();

    public static final RepositoryType LISTINGSECTOR = ListingSector.repositoryType();

    public static final RepositoryType LOADTYPEENUM = LoadTypeEnum.repositoryType();

    public static final RepositoryType LOAN = Loan.repositoryType();

    public static final RepositoryType LOANPARTICIPATION = LoanParticipation.repositoryType();

    public static final RepositoryType LOCATIONIDENTIFIER = LocationIdentifier.repositoryType();

    public static final RepositoryType MAKEWHOLEAMOUNT = MakeWholeAmount.repositoryType();

    public static final RepositoryType MANDATORYEARLYTERMINATION = MandatoryEarlyTermination.repositoryType();

    public static final RepositoryType MANDATORYEARLYTERMINATIONADJUSTEDDATES = MandatoryEarlyTerminationAdjustedDates.repositoryType();

    public static final RepositoryType MANUALEXERCISE = ManualExercise.repositoryType();

    public static final RepositoryType MARGINCALLACTIONENUM = MarginCallActionEnum.repositoryType();

    public static final RepositoryType MARGINCALLBASE = MarginCallBase.repositoryType();

    public static final RepositoryType MARGINCALLEXPOSURE = MarginCallExposure.repositoryType();

    public static final RepositoryType MARGINCALLINSTRUCTIONTYPE = MarginCallInstructionType.repositoryType();

    public static final RepositoryType MARGINCALLISSUANCE = MarginCallIssuance.repositoryType();

    public static final RepositoryType MARGINCALLRESPONSE = MarginCallResponse.repositoryType();

    public static final RepositoryType MARGINCALLRESPONSEACTION = MarginCallResponseAction.repositoryType();

    public static final RepositoryType MARGINCALLRESPONSETYPEENUM = MarginCallResponseTypeEnum.repositoryType();

    public static final RepositoryType MARGINTYPEENUM = MarginTypeEnum.repositoryType();

    public static final RepositoryType MARKETDISRUPTIONENUM = MarketDisruptionEnum.repositoryType();

    public static final RepositoryType MASTERAGREEMENTCLAUSE = MasterAgreementClause.repositoryType();

    public static final RepositoryType MASTERAGREEMENTCLAUSEIDENTIFIERENUM = MasterAgreementClauseIdentifierEnum.repositoryType();

    public static final RepositoryType MASTERAGREEMENTCLAUSEVARIANT = MasterAgreementClauseVariant.repositoryType();

    public static final RepositoryType MASTERAGREEMENTSCHEDULE = MasterAgreementSchedule.repositoryType();

    public static final RepositoryType MASTERAGREEMENTTYPEENUM = MasterAgreementTypeEnum.repositoryType();

    public static final RepositoryType MASTERAGREEMENTVARIABLESET = MasterAgreementVariableSet.repositoryType();

    public static final RepositoryType MASTERAGREEMENTVARIANTIDENTIFIERENUM = MasterAgreementVariantIdentifierEnum.repositoryType();

    public static final RepositoryType MASTERCONFIRMATIONANNEXTYPEENUM = MasterConfirmationAnnexTypeEnum.repositoryType();

    public static final RepositoryType MASTERCONFIRMATIONBASE = MasterConfirmationBase.repositoryType();

    public static final RepositoryType MASTERCONFIRMATIONTYPEENUM = MasterConfirmationTypeEnum.repositoryType();

    public static final RepositoryType MATRIXTERMENUM = MatrixTermEnum.repositoryType();

    public static final RepositoryType MATRIXTYPEENUM = MatrixTypeEnum.repositoryType();

    public static final RepositoryType MATURITYTYPEENUM = MaturityTypeEnum.repositoryType();

    public static final RepositoryType MEASURE = Measure.repositoryType();

    public static final RepositoryType MEASUREBASE = MeasureBase.repositoryType();

    public static final RepositoryType MEASURESCHEDULE = MeasureSchedule.repositoryType();

    public static final RepositoryType MESSAGEINFORMATION = MessageInformation.repositoryType();

    public static final RepositoryType METAFIELDS = MetaFields.repositoryType();

    public static final RepositoryType MONEY = Money.repositoryType();

    public static final RepositoryType MONEYBOUND = MoneyBound.repositoryType();

    public static final RepositoryType MONEYMARKETTYPEENUM = MoneyMarketTypeEnum.repositoryType();

    public static final RepositoryType MONEYRANGE = MoneyRange.repositoryType();

    public static final RepositoryType MULTIPLECREDITNOTATIONS = MultipleCreditNotations.repositoryType();

    public static final RepositoryType MULTIPLEDEBTTYPES = MultipleDebtTypes.repositoryType();

    public static final RepositoryType MULTIPLEEXERCISE = MultipleExercise.repositoryType();

    public static final RepositoryType MULTIPLEVALUATIONDATES = MultipleValuationDates.repositoryType();

    public static final RepositoryType NATIONALIZATIONORINSOLVENCYORDELISTINGEVENTENUM = NationalizationOrInsolvencyOrDelistingEventEnum.repositoryType();

    public static final RepositoryType NATURALPERSON = NaturalPerson.repositoryType();

    public static final RepositoryType NATURALPERSONROLE = NaturalPersonRole.repositoryType();

    public static final RepositoryType NATURALPERSONROLEENUM = NaturalPersonRoleEnum.repositoryType();

    public static final RepositoryType NEGATIVECRITERIA = NegativeCriteria.repositoryType();

    public static final RepositoryType NEGATIVEINTERESTRATETREATMENTENUM = NegativeInterestRateTreatmentEnum.repositoryType();

    public static final RepositoryType NEW = New.repositoryType();

    public static final RepositoryType NM = Nm.repositoryType();

    public static final RepositoryType NONCASHDIVIDENDTREATMENTENUM = NonCashDividendTreatmentEnum.repositoryType();

    public static final RepositoryType NONNEGATIVEQUANTITY = NonNegativeQuantity.repositoryType();

    public static final RepositoryType NONNEGATIVEQUANTITYSCHEDULE = NonNegativeQuantitySchedule.repositoryType();

    public static final RepositoryType NONNEGATIVESTEP = NonNegativeStep.repositoryType();

    public static final RepositoryType NONTRANSFERABLEPRODUCT = NonTransferableProduct.repositoryType();

    public static final RepositoryType NOTDOMESTICCURRENCY = NotDomesticCurrency.repositoryType();

    public static final RepositoryType NOTIONALADJUSTMENTENUM = NotionalAdjustmentEnum.repositoryType();

    public static final RepositoryType NUMBERBOUND = NumberBound.repositoryType();

    public static final RepositoryType NUMBERRANGE = NumberRange.repositoryType();

    public static final RepositoryType OBLIGATIONCATEGORYENUM = ObligationCategoryEnum.repositoryType();

    public static final RepositoryType OBLIGATIONS = Obligations.repositoryType();

    public static final RepositoryType OBSERVABLE = Observable.repositoryType();

    public static final RepositoryType OBSERVATION = Observation.repositoryType();

    public static final RepositoryType OBSERVATIONDATE = ObservationDate.repositoryType();

    public static final RepositoryType OBSERVATIONDATES = ObservationDates.repositoryType();

    public static final RepositoryType OBSERVATIONEVENT = ObservationEvent.repositoryType();

    public static final RepositoryType OBSERVATIONIDENTIFIER = ObservationIdentifier.repositoryType();

    public static final RepositoryType OBSERVATIONINSTRUCTION = ObservationInstruction.repositoryType();

    public static final RepositoryType OBSERVATIONPARAMETERS = ObservationParameters.repositoryType();

    public static final RepositoryType OBSERVATIONPERIODDATESENUM = ObservationPeriodDatesEnum.repositoryType();

    public static final RepositoryType OBSERVATIONSCHEDULE = ObservationSchedule.repositoryType();

    public static final RepositoryType OBSERVATIONSHIFTCALCULATION = ObservationShiftCalculation.repositoryType();

    public static final RepositoryType OBSERVATIONTERMS = ObservationTerms.repositoryType();

    public static final RepositoryType OFFSET = Offset.repositoryType();

    public static final RepositoryType OFFSETCALCULATION = OffsetCalculation.repositoryType();

    public static final RepositoryType OPTIONALEARLYTERMINATION = OptionalEarlyTermination.repositoryType();

    public static final RepositoryType OPTIONALEARLYTERMINATIONADJUSTEDDATES = OptionalEarlyTerminationAdjustedDates.repositoryType();

    public static final RepositoryType OPTIONEXERCISESTYLEENUM = OptionExerciseStyleEnum.repositoryType();

    public static final RepositoryType OPTIONFEATURE = OptionFeature.repositoryType();

    public static final RepositoryType OPTIONPAYOUT = OptionPayout.repositoryType();

    public static final RepositoryType OPTIONSTRIKE = OptionStrike.repositoryType();

    public static final RepositoryType OPTIONTYPEENUM = OptionTypeEnum.repositoryType();

    public static final RepositoryType ORDRTRNSMSSN = OrdrTrnsmssn.repositoryType();

    public static final RepositoryType OTHERAGREEMENT = OtherAgreement.repositoryType();

    public static final RepositoryType OTHERAGREEMENTTERMS = OtherAgreementTerms.repositoryType();

    public static final RepositoryType OTHERINDEX = OtherIndex.repositoryType();

    public static final RepositoryType OTHR = Othr.repositoryType();

    public static final RepositoryType PARAMETRICDATES = ParametricDates.repositoryType();

    public static final RepositoryType PARTIALEXERCISE = PartialExercise.repositoryType();

    public static final RepositoryType PARTY = Party.repositoryType();

    public static final RepositoryType PARTYCHANGEINSTRUCTION = PartyChangeInstruction.repositoryType();

    public static final RepositoryType PARTYCONTACTINFORMATION = PartyContactInformation.repositoryType();

    public static final RepositoryType PARTYCUSTOMISEDWORKFLOW = PartyCustomisedWorkflow.repositoryType();

    public static final RepositoryType PARTYDETERMINATIONENUM = PartyDeterminationEnum.repositoryType();

    public static final RepositoryType PARTYIDENTIFIER = PartyIdentifier.repositoryType();

    public static final RepositoryType PARTYIDENTIFIERTYPEENUM = PartyIdentifierTypeEnum.repositoryType();

    public static final RepositoryType PARTYREFERENCEPAYERRECEIVER = PartyReferencePayerReceiver.repositoryType();

    public static final RepositoryType PARTYROLE = PartyRole.repositoryType();

    public static final RepositoryType PARTYROLEENUM = PartyRoleEnum.repositoryType();

    public static final RepositoryType PASSTHROUGH = PassThrough.repositoryType();

    public static final RepositoryType PASSTHROUGHITEM = PassThroughItem.repositoryType();

    public static final RepositoryType PAYERRECEIVER = PayerReceiver.repositoryType();

    public static final RepositoryType PAYERRECEIVERENUM = PayerReceiverEnum.repositoryType();

    public static final RepositoryType PAYMENTCALCULATIONPERIOD = PaymentCalculationPeriod.repositoryType();

    public static final RepositoryType PAYMENTDATES = PaymentDates.repositoryType();

    public static final RepositoryType PAYMENTDATESCHEDULE = PaymentDateSchedule.repositoryType();

    public static final RepositoryType PAYMENTDETAIL = PaymentDetail.repositoryType();

    public static final RepositoryType PAYMENTDISCOUNTING = PaymentDiscounting.repositoryType();

    public static final RepositoryType PAYMENTRULE = PaymentRule.repositoryType();

    public static final RepositoryType PAYOUT = Payout.repositoryType();

    public static final RepositoryType PAYOUTBASE = PayoutBase.repositoryType();

    public static final RepositoryType PAYRELATIVETOENUM = PayRelativeToEnum.repositoryType();

    public static final RepositoryType PCDELIVERABLEOBLIGATIONCHARAC = PCDeliverableObligationCharac.repositoryType();

    public static final RepositoryType PERCENTAGERULE = PercentageRule.repositoryType();

    public static final RepositoryType PERFORMANCEPAYOUT = PerformancePayout.repositoryType();

    public static final RepositoryType PERFORMANCETRANSFERTYPEENUM = PerformanceTransferTypeEnum.repositoryType();

    public static final RepositoryType PERFORMANCEVALUATIONDATES = PerformanceValuationDates.repositoryType();

    public static final RepositoryType PERIOD = Period.repositoryType();

    public static final RepositoryType PERIODBOUND = PeriodBound.repositoryType();

    public static final RepositoryType PERIODENUM = PeriodEnum.repositoryType();

    public static final RepositoryType PERIODEXTENDEDENUM = PeriodExtendedEnum.repositoryType();

    public static final RepositoryType PERIODICDATES = PeriodicDates.repositoryType();

    public static final RepositoryType PERIODRANGE = PeriodRange.repositoryType();

    public static final RepositoryType PERIODTIMEENUM = PeriodTimeEnum.repositoryType();

    public static final RepositoryType PERSONIDENTIFIER = PersonIdentifier.repositoryType();

    public static final RepositoryType PERSONIDENTIFIERTYPEENUM = PersonIdentifierTypeEnum.repositoryType();

    public static final RepositoryType PHYSICALSETTLEMENTPERIOD = PhysicalSettlementPeriod.repositoryType();

    public static final RepositoryType PHYSICALSETTLEMENTTERMS = PhysicalSettlementTerms.repositoryType();

    public static final RepositoryType PORTFOLIO = Portfolio.repositoryType();

    public static final RepositoryType PORTFOLIORETURNTERMS = PortfolioReturnTerms.repositoryType();

    public static final RepositoryType PORTFOLIOSTATE = PortfolioState.repositoryType();

    public static final RepositoryType POSITION = Position.repositoryType();

    public static final RepositoryType POSITIONEVENTINTENTENUM = PositionEventIntentEnum.repositoryType();

    public static final RepositoryType POSITIONIDENTIFIER = PositionIdentifier.repositoryType();

    public static final RepositoryType POSITIONSTATUSENUM = PositionStatusEnum.repositoryType();

    public static final RepositoryType PREMIUMEXPRESSION = PremiumExpression.repositoryType();

    public static final RepositoryType PREMIUMTYPEENUM = PremiumTypeEnum.repositoryType();

    public static final RepositoryType PRIC = Pric.repositoryType();

    public static final RepositoryType PRICE = Price.repositoryType();

    public static final RepositoryType PRICECOMPOSITE = PriceComposite.repositoryType();

    public static final RepositoryType PRICEEXPRESSIONENUM = PriceExpressionEnum.repositoryType();

    public static final RepositoryType PRICEOPERANDENUM = PriceOperandEnum.repositoryType();

    public static final RepositoryType PRICEQUANTITY = PriceQuantity.repositoryType();

    public static final RepositoryType PRICERETURNTERMS = PriceReturnTerms.repositoryType();

    public static final RepositoryType PRICESCHEDULE = PriceSchedule.repositoryType();

    public static final RepositoryType PRICESOURCE = PriceSource.repositoryType();

    public static final RepositoryType PRICESOURCEDISRUPTION = PriceSourceDisruption.repositoryType();

    public static final RepositoryType PRICETIMINGENUM = PriceTimingEnum.repositoryType();

    public static final RepositoryType PRICETYPEENUM = PriceTypeEnum.repositoryType();

    public static final RepositoryType PRICINGDATES = PricingDates.repositoryType();

    public static final RepositoryType PRIMITIVEINSTRUCTION = PrimitiveInstruction.repositoryType();

    public static final RepositoryType PRINCIPALPAYMENT = PrincipalPayment.repositoryType();

    public static final RepositoryType PRINCIPALPAYMENTS = PrincipalPayments.repositoryType();

    public static final RepositoryType PRINCIPALPAYMENTSCHEDULE = PrincipalPaymentSchedule.repositoryType();

    public static final RepositoryType PRODUCT = Product.repositoryType();

    public static final RepositoryType PRODUCTIDENTIFIER = ProductIdentifier.repositoryType();

    public static final RepositoryType PRODUCTIDTYPEENUM = ProductIdTypeEnum.repositoryType();

    public static final RepositoryType PRODUCTTAXONOMY = ProductTaxonomy.repositoryType();

    public static final RepositoryType PROTECTIONTERMS = ProtectionTerms.repositoryType();

    public static final RepositoryType PRSN = Prsn.repositoryType();

    public static final RepositoryType PUBLICLYAVAILABLEINFORMATION = PubliclyAvailableInformation.repositoryType();

    public static final RepositoryType PUTCALLENUM = PutCallEnum.repositoryType();

    public static final RepositoryType QTY = Qty.repositoryType();

    public static final RepositoryType QUANTIFIERENUM = QuantifierEnum.repositoryType();

    public static final RepositoryType QUANTITY = Quantity.repositoryType();

    public static final RepositoryType QUANTITYCHANGEDIRECTIONENUM = QuantityChangeDirectionEnum.repositoryType();

    public static final RepositoryType QUANTITYCHANGEINSTRUCTION = QuantityChangeInstruction.repositoryType();

    public static final RepositoryType QUANTITYMULTIPLIER = QuantityMultiplier.repositoryType();

    public static final RepositoryType QUANTITYSCHEDULE = QuantitySchedule.repositoryType();

    public static final RepositoryType QUANTO = Quanto.repositoryType();

    public static final RepositoryType QUASIGOVERNMENTISSUERTYPE = QuasiGovernmentIssuerType.repositoryType();

    public static final RepositoryType QUOTATIONRATETYPEENUM = QuotationRateTypeEnum.repositoryType();

    public static final RepositoryType QUOTATIONSIDEENUM = QuotationSideEnum.repositoryType();

    public static final RepositoryType QUOTATIONSTYLEENUM = QuotationStyleEnum.repositoryType();

    public static final RepositoryType QUOTEBASISENUM = QuoteBasisEnum.repositoryType();

    public static final RepositoryType QUOTEDCURRENCYPAIR = QuotedCurrencyPair.repositoryType();

    public static final RepositoryType RATEOBSERVATION = RateObservation.repositoryType();

    public static final RepositoryType RATESCHEDULE = RateSchedule.repositoryType();

    public static final RepositoryType RATESPECIFICATION = RateSpecification.repositoryType();

    public static final RepositoryType RATETREATMENTENUM = RateTreatmentEnum.repositoryType();

    public static final RepositoryType RATINGPRIORITYRESOLUTIONENUM = RatingPriorityResolutionEnum.repositoryType();

    public static final RepositoryType REALISEDVARIANCEMETHODENUM = RealisedVarianceMethodEnum.repositoryType();

    public static final RepositoryType RECORDAMOUNTTYPEENUM = RecordAmountTypeEnum.repositoryType();

    public static final RepositoryType REFERENCE = Reference.repositoryType();

    public static final RepositoryType REFERENCEBANK = ReferenceBank.repositoryType();

    public static final RepositoryType REFERENCEBANKS = ReferenceBanks.repositoryType();

    public static final RepositoryType REFERENCEINFORMATION = ReferenceInformation.repositoryType();

    public static final RepositoryType REFERENCEOBLIGATION = ReferenceObligation.repositoryType();

    public static final RepositoryType REFERENCEPAIR = ReferencePair.repositoryType();

    public static final RepositoryType REFERENCEPOOL = ReferencePool.repositoryType();

    public static final RepositoryType REFERENCEPOOLITEM = ReferencePoolItem.repositoryType();

    public static final RepositoryType REFERENCESWAPCURVE = ReferenceSwapCurve.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAACCOUNT = ReferenceWithMetaAccount.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAADJUSTABLEORRELATIVEDATE = ReferenceWithMetaAdjustableOrRelativeDate.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAADJUSTABLEORRELATIVEDATES = ReferenceWithMetaAdjustableOrRelativeDates.repositoryType();

    public static final RepositoryType REFERENCEWITHMETABASKETCONSTITUENT = ReferenceWithMetaBasketConstituent.repositoryType();

    public static final RepositoryType REFERENCEWITHMETABUSINESSCENTERS = ReferenceWithMetaBusinessCenters.repositoryType();

    public static final RepositoryType REFERENCEWITHMETABUSINESSDAYADJUSTMENTS = ReferenceWithMetaBusinessDayAdjustments.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACALCULATIONPERIODDATES = ReferenceWithMetaCalculationPeriodDates.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACASHSETTLEMENTTERMS = ReferenceWithMetaCashSettlementTerms.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACOLLATERAL = ReferenceWithMetaCollateral.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACOLLATERALPORTFOLIO = ReferenceWithMetaCollateralPortfolio.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACONTRACTDETAILS = ReferenceWithMetaContractDetails.repositoryType();

    public static final RepositoryType REFERENCEWITHMETACREDITEVENTS = ReferenceWithMetaCreditEvents.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAEXECUTIONDETAILS = ReferenceWithMetaExecutionDetails.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAFIXEDRATESPECIFICATION = ReferenceWithMetaFixedRateSpecification.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAINTERESTRATEINDEX = ReferenceWithMetaInterestRateIndex.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAINTERESTRATEPAYOUT = ReferenceWithMetaInterestRatePayout.repositoryType();

    public static final RepositoryType REFERENCEWITHMETALEGALAGREEMENT = ReferenceWithMetaLegalAgreement.repositoryType();

    public static final RepositoryType REFERENCEWITHMETALEGALENTITY = ReferenceWithMetaLegalEntity.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAMONEY = ReferenceWithMetaMoney.repositoryType();

    public static final RepositoryType REFERENCEWITHMETANATURALPERSON = ReferenceWithMetaNaturalPerson.repositoryType();

    public static final RepositoryType REFERENCEWITHMETANONNEGATIVEQUANTITYSCHEDULE = ReferenceWithMetaNonNegativeQuantitySchedule.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAOBSERVABLE = ReferenceWithMetaObservable.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAOBSERVATION = ReferenceWithMetaObservation.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAOPTIONPAYOUT = ReferenceWithMetaOptionPayout.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPARTY = ReferenceWithMetaParty.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPAYMENTDATES = ReferenceWithMetaPaymentDates.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPAYOUT = ReferenceWithMetaPayout.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPERFORMANCEVALUATIONDATES = ReferenceWithMetaPerformanceValuationDates.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPHYSICALSETTLEMENTTERMS = ReferenceWithMetaPhysicalSettlementTerms.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPORTFOLIOSTATE = ReferenceWithMetaPortfolioState.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPRICESCHEDULE = ReferenceWithMetaPriceSchedule.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAPROTECTIONTERMS = ReferenceWithMetaProtectionTerms.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAQUOTEDCURRENCYPAIR = ReferenceWithMetaQuotedCurrencyPair.repositoryType();

    public static final RepositoryType REFERENCEWITHMETARATEOBSERVATION = ReferenceWithMetaRateObservation.repositoryType();

    public static final RepositoryType REFERENCEWITHMETARESOLVABLEPRICEQUANTITY = ReferenceWithMetaResolvablePriceQuantity.repositoryType();

    public static final RepositoryType REFERENCEWITHMETASTRING = ReferenceWithMetaString.repositoryType();

    public static final RepositoryType REFERENCEWITHMETATRADE = ReferenceWithMetaTrade.repositoryType();

    public static final RepositoryType REFERENCEWITHMETATRADESTATE = ReferenceWithMetaTradeState.repositoryType();

    public static final RepositoryType REFERENCEWITHMETAWORKFLOWSTEP = ReferenceWithMetaWorkflowStep.repositoryType();

    public static final RepositoryType REFRATE = RefRate.repositoryType();

    public static final RepositoryType REGIMROLEENUM = RegIMRoleEnum.repositoryType();

    public static final RepositoryType REGIONALGOVERNMENTISSUERTYPE = RegionalGovernmentIssuerType.repositoryType();

    public static final RepositoryType REGMARGINTYPEENUM = RegMarginTypeEnum.repositoryType();

    public static final RepositoryType RELATEDPARTY = RelatedParty.repositoryType();

    public static final RepositoryType RELATIVEDATEOFFSET = RelativeDateOffset.repositoryType();

    public static final RepositoryType RELATIVEDATES = RelativeDates.repositoryType();

    public static final RepositoryType REPODURATIONENUM = RepoDurationEnum.repositoryType();

    public static final RepositoryType REPRESENTATIONS = Representations.repositoryType();

    public static final RepositoryType RESET = Reset.repositoryType();

    public static final RepositoryType RESETDATES = ResetDates.repositoryType();

    public static final RepositoryType RESETFREQUENCY = ResetFrequency.repositoryType();

    public static final RepositoryType RESETINSTRUCTION = ResetInstruction.repositoryType();

    public static final RepositoryType RESETRELATIVETOENUM = ResetRelativeToEnum.repositoryType();

    public static final RepositoryType RESOLVABLEPRICEQUANTITY = ResolvablePriceQuantity.repositoryType();

    public static final RepositoryType RESOURCE = Resource.repositoryType();

    public static final RepositoryType RESOURCELENGTH = ResourceLength.repositoryType();

    public static final RepositoryType RESOURCETYPEENUM = ResourceTypeEnum.repositoryType();

    public static final RepositoryType RESTRUCTURING = Restructuring.repositoryType();

    public static final RepositoryType RESTRUCTURINGENUM = RestructuringEnum.repositoryType();

    public static final RepositoryType RETURNAMOUNT = ReturnAmount.repositoryType();

    public static final RepositoryType RETURNINSTRUCTION = ReturnInstruction.repositoryType();

    public static final RepositoryType RETURNTERMS = ReturnTerms.repositoryType();

    public static final RepositoryType RETURNTERMSBASE = ReturnTermsBase.repositoryType();

    public static final RepositoryType RETURNTYPEENUM = ReturnTypeEnum.repositoryType();

    public static final RepositoryType ROLLCONVENTIONENUM = RollConventionEnum.repositoryType();

    public static final RepositoryType ROLLFEATURE = RollFeature.repositoryType();

    public static final RepositoryType ROLLSOURCECALENDARENUM = RollSourceCalendarEnum.repositoryType();

    public static final RepositoryType ROUNDING = Rounding.repositoryType();

    public static final RepositoryType ROUNDINGDIRECTIONENUM = RoundingDirectionEnum.repositoryType();

    public static final RepositoryType ROUNDINGFREQUENCYENUM = RoundingFrequencyEnum.repositoryType();

    public static final RepositoryType ROUNDINGMODEENUM = RoundingModeEnum.repositoryType();

    public static final RepositoryType SCHEDULE = Schedule.repositoryType();

    public static final RepositoryType SCHEDULEDTRANSFER = ScheduledTransfer.repositoryType();

    public static final RepositoryType SCHEDULEDTRANSFERENUM = ScheduledTransferEnum.repositoryType();

    public static final RepositoryType SCHEDULEPERIOD = SchedulePeriod.repositoryType();

    public static final RepositoryType SCHMENM = SchmeNm.repositoryType();

    public static final RepositoryType SECURITY = Security.repositoryType();

    public static final RepositoryType SECURITYAGREEMENTELECTIONS = SecurityAgreementElections.repositoryType();

    public static final RepositoryType SECURITYLENDINGINVOICE = SecurityLendingInvoice.repositoryType();

    public static final RepositoryType SECURITYLOCATE = SecurityLocate.repositoryType();

    public static final RepositoryType SELLR = Sellr.repositoryType();

    public static final RepositoryType SETTLEDENTITYMATRIX = SettledEntityMatrix.repositoryType();

    public static final RepositoryType SETTLEDENTITYMATRIXSOURCEENUM = SettledEntityMatrixSourceEnum.repositoryType();

    public static final RepositoryType SETTLEMENTBASE = SettlementBase.repositoryType();

    public static final RepositoryType SETTLEMENTCENTREENUM = SettlementCentreEnum.repositoryType();

    public static final RepositoryType SETTLEMENTDATE = SettlementDate.repositoryType();

    public static final RepositoryType SETTLEMENTPAYOUT = SettlementPayout.repositoryType();

    public static final RepositoryType SETTLEMENTPROVISION = SettlementProvision.repositoryType();

    public static final RepositoryType SETTLEMENTRATEOPTION = SettlementRateOption.repositoryType();

    public static final RepositoryType SETTLEMENTRATEOPTIONENUM = SettlementRateOptionEnum.repositoryType();

    public static final RepositoryType SETTLEMENTTERMS = SettlementTerms.repositoryType();

    public static final RepositoryType SETTLEMENTTYPEENUM = SettlementTypeEnum.repositoryType();

    public static final RepositoryType SHAPINGPROVISION = ShapingProvision.repositoryType();

    public static final RepositoryType SHAREEXTRAORDINARYEVENTENUM = ShareExtraordinaryEventEnum.repositoryType();

    public static final RepositoryType SINGLEVALUATIONDATE = SingleValuationDate.repositoryType();

    public static final RepositoryType SNGL = Sngl.repositoryType();

    public static final RepositoryType SOVEREIGNAGENCYRATING = SovereignAgencyRating.repositoryType();

    public static final RepositoryType SPECIALPURPOSEVEHICLEISSUERTYPE = SpecialPurposeVehicleIssuerType.repositoryType();

    public static final RepositoryType SPECIFICASSET = SpecificAsset.repositoryType();

    public static final RepositoryType SPECIFIEDCURRENCY = SpecifiedCurrency.repositoryType();

    public static final RepositoryType SPECIFIEDENTITYCLAUSEENUM = SpecifiedEntityClauseEnum.repositoryType();

    public static final RepositoryType SPECIFIEDENTITYTERMSENUM = SpecifiedEntityTermsEnum.repositoryType();

    public static final RepositoryType SPLITINSTRUCTION = SplitInstruction.repositoryType();

    public static final RepositoryType SPREADCALCULATIONMETHODENUM = SpreadCalculationMethodEnum.repositoryType();

    public static final RepositoryType SPREADSCHEDULE = SpreadSchedule.repositoryType();

    public static final RepositoryType SPREADSCHEDULETYPEENUM = SpreadScheduleTypeEnum.repositoryType();

    public static final RepositoryType STANDARDIZEDSCHEDULE = StandardizedSchedule.repositoryType();

    public static final RepositoryType STANDARDIZEDSCHEDULEASSETCLASSENUM = StandardizedScheduleAssetClassEnum.repositoryType();

    public static final RepositoryType STANDARDIZEDSCHEDULEINITIALMARGIN = StandardizedScheduleInitialMargin.repositoryType();

    public static final RepositoryType STANDARDIZEDSCHEDULEPRODUCTCLASSENUM = StandardizedScheduleProductClassEnum.repositoryType();

    public static final RepositoryType STANDARDIZEDSCHEDULETRADEINFO = StandardizedScheduleTradeInfo.repositoryType();

    public static final RepositoryType STANDARDSETTLEMENTSTYLEENUM = StandardSettlementStyleEnum.repositoryType();

    public static final RepositoryType STATE = State.repositoryType();

    public static final RepositoryType STOCKSPLITINSTRUCTION = StockSplitInstruction.repositoryType();

    public static final RepositoryType STRATEGYFEATURE = StrategyFeature.repositoryType();

    public static final RepositoryType STRIKE = Strike.repositoryType();

    public static final RepositoryType STRIKESCHEDULE = StrikeSchedule.repositoryType();

    public static final RepositoryType STRIKESPREAD = StrikeSpread.repositoryType();

    public static final RepositoryType STUBCALCULATIONPERIODAMOUNT = StubCalculationPeriodAmount.repositoryType();

    public static final RepositoryType STUBFLOATINGRATE = StubFloatingRate.repositoryType();

    public static final RepositoryType STUBPERIOD = StubPeriod.repositoryType();

    public static final RepositoryType STUBPERIODTYPEENUM = StubPeriodTypeEnum.repositoryType();

    public static final RepositoryType STUBVALUE = StubValue.repositoryType();

    public static final RepositoryType SUBSTITUTIONPROVISIONS = SubstitutionProvisions.repositoryType();

    public static final RepositoryType SUPRANATIONALISSUERTYPEENUM = SupraNationalIssuerTypeEnum.repositoryType();

    public static final RepositoryType SWAPCURVEVALUATION = SwapCurveValuation.repositoryType();

    public static final RepositoryType SWP = Swp.repositoryType();

    public static final RepositoryType SWPIN = SwpIn.repositoryType();

    public static final RepositoryType SWPOUT = SwpOut.repositoryType();

    public static final RepositoryType TAXONOMY = Taxonomy.repositoryType();

    public static final RepositoryType TAXONOMYCLASSIFICATION = TaxonomyClassification.repositoryType();

    public static final RepositoryType TAXONOMYSOURCEENUM = TaxonomySourceEnum.repositoryType();

    public static final RepositoryType TAXONOMYVALUE = TaxonomyValue.repositoryType();

    public static final RepositoryType TELEPHONENUMBER = TelephoneNumber.repositoryType();

    public static final RepositoryType TELEPHONETYPEENUM = TelephoneTypeEnum.repositoryType();

    public static final RepositoryType TERM = Term.repositoryType();

    public static final RepositoryType TERMINATIONCURRENCYCONDITIONENUM = TerminationCurrencyConditionEnum.repositoryType();

    public static final RepositoryType TERMINATIONPROVISION = TerminationProvision.repositoryType();

    public static final RepositoryType TERMSCHANGEINSTRUCTION = TermsChangeInstruction.repositoryType();

    public static final RepositoryType TIMETYPEENUM = TimeTypeEnum.repositoryType();

    public static final RepositoryType TIMEUNITENUM = TimeUnitEnum.repositoryType();

    public static final RepositoryType TIMEZONE = TimeZone.repositoryType();

    public static final RepositoryType TRADABLEPRODUCT = TradableProduct.repositoryType();

    public static final RepositoryType TRADE = Trade.repositoryType();

    public static final RepositoryType TRADEIDENTIFIER = TradeIdentifier.repositoryType();

    public static final RepositoryType TRADEIDENTIFIERTYPEENUM = TradeIdentifierTypeEnum.repositoryType();

    public static final RepositoryType TRADELOT = TradeLot.repositoryType();

    public static final RepositoryType TRADEPRICINGREPORT = TradePricingReport.repositoryType();

    public static final RepositoryType TRADESTATE = TradeState.repositoryType();

    public static final RepositoryType TRANCHE = Tranche.repositoryType();

    public static final RepositoryType TRANSACTEDPRICE = TransactedPrice.repositoryType();

    public static final RepositoryType TRANSACTIONADDITIONALTERMS = TransactionAdditionalTerms.repositoryType();

    public static final RepositoryType TRANSFER = Transfer.repositoryType();

    public static final RepositoryType TRANSFERABLEPRODUCT = TransferableProduct.repositoryType();

    public static final RepositoryType TRANSFEREXPRESSION = TransferExpression.repositoryType();

    public static final RepositoryType TRANSFERINSTRUCTION = TransferInstruction.repositoryType();

    public static final RepositoryType TRANSFERSETTLEMENTENUM = TransferSettlementEnum.repositoryType();

    public static final RepositoryType TRANSFERSTATE = TransferState.repositoryType();

    public static final RepositoryType TRANSFERSTATUSENUM = TransferStatusEnum.repositoryType();

    public static final RepositoryType TRIGGER = Trigger.repositoryType();

    public static final RepositoryType TRIGGEREVENT = TriggerEvent.repositoryType();

    public static final RepositoryType TRIGGERTIMETYPEENUM = TriggerTimeTypeEnum.repositoryType();

    public static final RepositoryType TRIGGERTYPEENUM = TriggerTypeEnum.repositoryType();

    public static final RepositoryType TX = Tx.repositoryType();

    public static final RepositoryType UK_EMIR_ELIGIBLECOLLATERALENUM = UKEMIREligibleCollateralEnum.repositoryType();

    public static final RepositoryType UMBRELLAAGREEMENT = UmbrellaAgreement.repositoryType();

    public static final RepositoryType UMBRELLAAGREEMENTENTITY = UmbrellaAgreementEntity.repositoryType();

    public static final RepositoryType UNDERLIER = Underlier.repositoryType();

    public static final RepositoryType UNDERLIERSUBSTITUTIONPROVISION = UnderlierSubstitutionProvision.repositoryType();

    public static final RepositoryType UNDRLYGINSTRM = UndrlygInstrm.repositoryType();

    public static final RepositoryType UNITTYPE = UnitType.repositoryType();

    public static final RepositoryType US_CFTC_PR_ELIGIBLECOLLATERALENUM = USCFTCPREligibleCollateralEnum.repositoryType();

    public static final RepositoryType VALUATION = Valuation.repositoryType();

    public static final RepositoryType VALUATIONDATE = ValuationDate.repositoryType();

    public static final RepositoryType VALUATIONDATES = ValuationDates.repositoryType();

    public static final RepositoryType VALUATIONINSTRUCTION = ValuationInstruction.repositoryType();

    public static final RepositoryType VALUATIONMETHOD = ValuationMethod.repositoryType();

    public static final RepositoryType VALUATIONMETHODENUM = ValuationMethodEnum.repositoryType();

    public static final RepositoryType VALUATIONPOSTPONEMENT = ValuationPostponement.repositoryType();

    public static final RepositoryType VALUATIONSOURCE = ValuationSource.repositoryType();

    public static final RepositoryType VALUATIONSOURCEENUM = ValuationSourceEnum.repositoryType();

    public static final RepositoryType VALUATIONTERMS = ValuationTerms.repositoryType();

    public static final RepositoryType VALUATIONTYPEENUM = ValuationTypeEnum.repositoryType();

    public static final RepositoryType VARIANCECAPFLOOR = VarianceCapFloor.repositoryType();

    public static final RepositoryType VARIANCERETURNTERMS = VarianceReturnTerms.repositoryType();

    public static final RepositoryType VELOCITY = Velocity.repositoryType();

    public static final RepositoryType VOLATILITYCAPFLOOR = VolatilityCapFloor.repositoryType();

    public static final RepositoryType VOLATILITYRETURNTERMS = VolatilityReturnTerms.repositoryType();

    public static final RepositoryType WAREHOUSEIDENTITYENUM = WarehouseIdentityEnum.repositoryType();

    public static final RepositoryType WEATHERUNITENUM = WeatherUnitEnum.repositoryType();

    public static final RepositoryType WEEKLYROLLCONVENTIONENUM = WeeklyRollConventionEnum.repositoryType();

    public static final RepositoryType WEIGHTEDAVERAGINGOBSERVATION = WeightedAveragingObservation.repositoryType();

    public static final RepositoryType WORKFLOW = Workflow.repositoryType();

    public static final RepositoryType WORKFLOWSTATE = WorkflowState.repositoryType();

    public static final RepositoryType WORKFLOWSTATUSENUM = WorkflowStatusEnum.repositoryType();

    public static final RepositoryType WORKFLOWSTEP = WorkflowStep.repositoryType();

    public static final RepositoryType WORKFLOWSTEPAPPROVAL = WorkflowStepApproval.repositoryType();

    private FINOSCDM60d07Types() {
    }
}
