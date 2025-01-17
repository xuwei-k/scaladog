package scaladog

import org.scalatest.FunSpec

class MetricTypeTest extends FunSpec {

  describe("readwriter") {

    it("should read a string") {
      assert(DDPickle.read[MetricType]("\"rate\"") == MetricType.Rate)
    }

    it("should throw an IllegalArgumentException when read an invalid string") {
      assertThrows[IllegalArgumentException](DDPickle.read[MetricType]("\"invalid\"") == null)
    }

    it("should write JSON from a string") {
      assert(DDPickle.write(MetricType.Gauge.asMetricType) == "\"gauge\"")
    }
  }
}
