db.createCollection(
    "TB_INDEX_TEST1",                           /* <-- 컬렉션 이름 */
    {
        timeseries: {                     /* <-- Timeseries 컬렉션임을 정의 */
            timeField: "timestamp",        /* <-- 시간이 들어가는 필드명 지정 */
            metaField: "metadata",         /* <-- 메타 데이터 필드명 지정 */
            granularity: "hours"           /* <-- granularity 설정(옵션) */
        },
        expireAfterSeconds: 604800        /* <-- TTL 인덱스 사용가능 */
    }
)