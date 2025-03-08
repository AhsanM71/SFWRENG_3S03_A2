package test.min_tests;

import org.junit.*;
import min.Min;

import static org.junit.Assert.*;

import java.util.*;

public class MinTestsVector {

    @Test
    // Tests finding the minimum value in an unsorted Vector of positive integers.
    public void test_min_with_positive_unsorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, 4, 5, 1, 4, 8, 9, 10));
        int actual = Min.min(listOfInts);
        assertEquals(1, actual);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of positive integers.
    public void test_min_with_positive_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, 4, 5, 1, 4, 8, 9, 10));
        listOfInts.sort(null);
        int actual = Min.min(listOfInts);
        assertEquals(1, actual);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of positive
    // integers.
    public void test_min_with_positive_reversed_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, 4, 5, 1, 4, 8, 9, 10));
        listOfInts.sort(Collections.reverseOrder());
        int actual = Min.min(listOfInts);
        assertEquals(1, actual);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single positive
    // integer.
    public void test_min_with_single_positive_integer() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3));
        int actual = Min.min(listOfInts);
        assertEquals(3, actual);
    }

    // ----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of negative integers.
    public void test_min_with_negative_unsorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(-1, -2, -3, -400, -5, -9, -1000));
        int actual = Min.min(listOfInts);
        assertEquals(-1000, actual);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of negative integers.
    public void test_min_with_negative_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(-1, -2, -3, -400, -5, -9, -1000));
        listOfInts.sort(null);
        int actual = Min.min(listOfInts);
        assertEquals(-1000, actual);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of negative
    // integers.
    public void test_min_with_negative_reversed_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(-1, -2, -3, -400, -5, -9, -1000));
        listOfInts.sort(Collections.reverseOrder());
        int actual = Min.min(listOfInts);
        assertEquals(-1000, actual);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single negative
    // integer.
    public void test_min_with_single_negative_integer() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(-3));
        int actual = Min.min(listOfInts);
        assertEquals(-3, actual);
    }

    // -----------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector containing both
    // positive
    // and negative integers.
    public void test_min_with_mixed_unsorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, -4, 5, 1, 4, -8, 9, -10));
        int actual = Min.min(listOfInts);
        assertEquals(-10, actual);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector containing both positive
    // and
    // negative integers.
    public void test_min_with_mixed_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, -4, 5, 1, 4, -8, 9, -10));
        listOfInts.sort(null);
        int actual = Min.min(listOfInts);
        assertEquals(-10, actual);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector containing both
    // positive and negative integers.
    public void test_min_with_mixed_reversed_sorted_Vector_of_ints() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(3, -4, 5, 1, 4, -8, 9, -10));
        listOfInts.sort(Collections.reverseOrder());
        int actual = Min.min(listOfInts);
        assertEquals(-10, actual);
    }

    @Test
    // Tests finding the minimum value in a Vector containing extreme integer values
    // (MAX_VALUE, MIN_VALUE, 0).
    public void test_min_with_mixed_extremes() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, 1));
        int actual = Min.min(listOfInts);
        assertEquals(Integer.MIN_VALUE, actual);
    }

    // -----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value when the smallest number appears multiple
    // times in the list.
    public void test_min_with_duplicate_min_values() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(5, 2, 2, 8, 2, 10));
        int actual = Min.min(listOfInts);
        assertEquals(2, actual);
    }

    @Test
    // Tests finding the minimum value when all elements in the Vector are
    // identical.
    public void test_min_with_all_identical_values() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(7, 7, 7, 7, 7));
        int actual = Min.min(listOfInts);
        assertEquals(7, actual);
    }

    @Test
    // Tests finding the minimum value in a Vector with very large and very small
    // integer values.
    public void test_min_with_large_integers() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0));
        int actual = Min.min(listOfInts);
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    // Tests finding the minimum value in a Vector that contains zero.
    public void test_min_with_zero() {
        Vector<Integer> listOfInts = new Vector<>(Arrays.asList(0, 1, 1, 1, 2, 2));
        int actual = Min.min(listOfInts);
        assertEquals(0, actual);
    }

    // -----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of positive double
    // values.
    public void test_min_with_positive_unsorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.5, 4.7, 5.8, 1.2, 4.4, 8.0, 9.8, 10.3));
        double actual = Min.min(listOfInts);
        assertEquals(1.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of positive double values.
    public void test_min_with_positive_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.5, 4.7, 5.8, 1.2, 4.4, 8.0, 9.8, 10.3));
        listOfInts.sort(null);
        double actual = Min.min(listOfInts);
        assertEquals(1.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of positive double
    // values.
    public void test_min_with_positive_reversed_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.5, 4.7, 5.8, 1.2, 4.4, 8.0, 9.8, 10.3));
        listOfInts.sort(Collections.reverseOrder());
        double actual = Min.min(listOfInts);
        assertEquals(1.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single positive
    // double.
    public void test_min_with_single_positive_double() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.7));
        double actual = Min.min(listOfInts);
        assertEquals(3.7, actual, 0.0001);
    }

    // ----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of negative double
    // values.
    public void test_min_with_negative_unsorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(-1.8, -2.3, -3.2, -400.5, -5.9, -9.3, -1000.2));
        double actual = Min.min(listOfInts);
        assertEquals(-1000.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of negative double values.
    public void test_min_with_negative_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(-1.8, -2.3, -3.2, -400.5, -5.9, -9.3, -1000.2));
        listOfInts.sort(null);
        double actual = Min.min(listOfInts);
        assertEquals(-1000.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of negative double
    // values.
    public void test_min_with_negative_reversed_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(-1.8, -2.3, -3.2, -400.5, -5.9, -9.3, -1000.2));
        listOfInts.sort(Collections.reverseOrder());
        double actual = Min.min(listOfInts);
        assertEquals(-1000.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single negative
    // double.
    public void test_min_with_single_negative_double() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(-3.7));
        double actual = Min.min(listOfInts);
        assertEquals(-3.7, actual, 0.0001);
    }

    // -----------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector containing both
    // positive
    // and negative double values.
    public void test_min_with_mixed_unsorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.1, -4.2, 5.3, 1.5, 4.9, -8.2, 9.1, -10.9));
        double actual = Min.min(listOfInts);
        assertEquals(-10.9, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector containing both positive
    // and
    // negative double values.
    public void test_min_with_mixed_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.1, -4.2, 5.3, 1.5, 4.9, -8.2, 9.1, -10.9));
        listOfInts.sort(null);
        Double actual = Min.min(listOfInts);
        assertEquals(-10.9, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector containing both
    // positive and negative double values.
    public void test_min_with_mixed_reversed_sorted_Vector_of_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(3.1, -4.2, 5.3, 1.5, 4.9, -8.2, 9.1, -10.9));
        listOfInts.sort(Collections.reverseOrder());
        double actual = Min.min(listOfInts);
        assertEquals(-10.9, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a Vector containing extreme double values
    // (MAX_VALUE, MIN_VALUE, 0.0).
    public void test_min_with_mixed_extremes_doubles() {
        Vector<Double> listOfInts = new Vector<>(
                Arrays.asList(Double.MAX_VALUE, Double.MIN_VALUE, 0.0, 1.5, 1.2));
        double actual = Min.min(listOfInts);
        assertEquals(Double.MIN_VALUE, actual, 0.0001);
    }

    // -----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value when the smallest number appears multiple
    // times in the list.
    public void test_min_with_duplicate_min_values_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(5.1, 2.2, 2.2, 8.6, 2.2, 10.9));
        double actual = Min.min(listOfInts);
        assertEquals(2.2, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value when all elements in the Vector are
    // identical.
    public void test_min_with_all_identical_values_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(7.4, 7.4, 7.4, 7.4, 7.4));
        double actual = Min.min(listOfInts);
        assertEquals(7.4, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a Vector with very large and very small
    // double values.
    public void test_min_with_large_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(Double.MAX_VALUE, Double.MIN_VALUE, 0.0));
        double actual = Min.min(listOfInts);
        assertEquals(Double.MIN_VALUE, actual, 0.0001);
    }

    @Test
    // Tests finding the minimum value in a Vector that contains zero.
    public void test_min_with_zero_doubles() {
        Vector<Double> listOfInts = new Vector<>(Arrays.asList(0.0, 1.2, 1.3, 1.5, 2.8, 2.1));
        double actual = Min.min(listOfInts);
        assertEquals(0.0, actual, 0.0001);
    }

    // -----------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of very small positive
    // double values.
    public void test_min_with_positive_unsorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E-200, 4.7E-200, 5.8E-200, 1.2E-200, 4.4E-200, 8.0E-200, 9.8E-200, 10.3E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of very small positive
    // double values.
    public void test_min_with_positive_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E-200, 4.7E-200, 5.8E-200, 1.2E-200, 4.4E-200, 8.0E-200, 9.8E-200, 10.3E-200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of very small
    // positive double values.
    public void test_min_with_positive_reversed_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E-200, 4.7E-200, 5.8E-200, 1.2E-200, 4.4E-200, 8.0E-200, 9.8E-200, 10.3E-200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single very small
    // positive double.
    public void test_min_with_single_positive_small_double() {
        Vector<Double> listOfDoubles = new Vector<>(Arrays.asList(3.7E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(3.7E-200, actual, 1E-220);
    }

    // ----------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of very small negative
    // double values.
    public void test_min_with_negative_unsorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E-200, -2.3E-200, -3.2E-200, -400.5E-200, -5.9E-200, -9.3E-200, -1000.2E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of very small negative
    // double values.
    public void test_min_with_negative_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E-200, -2.3E-200, -3.2E-200, -400.5E-200, -5.9E-200, -9.3E-200, -1000.2E-200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of very small
    // negative double values.
    public void test_min_with_negative_reversed_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E-200, -2.3E-200, -3.2E-200, -400.5E-200, -5.9E-200, -9.3E-200, -1000.2E-200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single very small
    // negative double.
    public void test_min_with_single_negative_small_double() {
        Vector<Double> listOfDoubles = new Vector<>(Arrays.asList(-3.7E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-3.7E-200, actual, 1E-220);
    }

    // ----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector containing both very
    // small positive and negative double values.
    public void test_min_with_mixed_unsorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E-200, -4.2E-200, 5.3E-200, 1.5E-200, 4.9E-200, -8.2E-200, 9.1E-200, -10.9E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector containing both very small
    // positive and negative double values.
    public void test_min_with_mixed_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E-200, -4.2E-200, 5.3E-200, 1.5E-200, 4.9E-200, -8.2E-200, 9.1E-200, -10.9E-200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector containing both
    // very
    // small positive and negative double values.
    public void test_min_with_mixed_reversed_sorted_Vector_of_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E-200, -4.2E-200, 5.3E-200, 1.5E-200, 4.9E-200, -8.2E-200, 9.1E-200, -10.9E-200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E-200, actual, 1E-220);
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value when the smallest number appears multiple
    // times in the Vector of very small doubles.
    public void test_min_with_duplicate_min_values_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(5.1E-200, 2.2E-200, 2.2E-200, 8.6E-200, 2.2E-200, 10.9E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(2.2E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value when all elements in the Vector are identical
    // very small double values.
    public void test_min_with_all_identical_values_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(7.4E-200, 7.4E-200, 7.4E-200, 7.4E-200, 7.4E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(7.4E-200, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a Vector containing extreme double values
    // (Double.MAX_VALUE, Double.MIN_VALUE, and small doubles).
    public void test_min_with_mixed_extremes_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(Double.MAX_VALUE, Double.MIN_VALUE, 1.5E-200, 1.2E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(Double.MIN_VALUE, actual, 1E-220);
    }

    @Test
    // Tests finding the minimum value in a Vector that contains zero along with
    // very
    // small positive double values.
    public void test_min_with_zero_and_small_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(0.0, 1.2E-200, 1.3E-200, 1.5E-200, 2.8E-200, 2.1E-200));
        double actual = Min.min(listOfDoubles);
        assertEquals(0.0, actual, 1E-220);
    }

    // ---------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of large positive
    // double
    // values.
    public void test_min_with_positive_unsorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E200, 4.7E200, 5.8E200, 1.2E200, 4.4E200, 8.0E200, 9.8E200, 10.3E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E200, actual, 1E190); // Delta for large doubles
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of large positive double
    // values.
    public void test_min_with_positive_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E200, 4.7E200, 5.8E200, 1.2E200, 4.4E200, 8.0E200, 9.8E200, 10.3E200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of large positive
    // double values.
    public void test_min_with_positive_reversed_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.5E200, 4.7E200, 5.8E200, 1.2E200, 4.4E200, 8.0E200, 9.8E200, 10.3E200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(1.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single large
    // positive
    // double.
    public void test_min_with_single_positive_large_double() {
        Vector<Double> listOfDoubles = new Vector<>(Arrays.asList(3.7E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(3.7E200, actual, 1E190);
    }

    // ----------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of large negative
    // double
    // values.
    public void test_min_with_negative_unsorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E200, -2.3E200, -3.2E200, -400.5E200, -5.9E200, -9.3E200, -1000.2E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of large negative double
    // values.
    public void test_min_with_negative_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E200, -2.3E200, -3.2E200, -400.5E200, -5.9E200, -9.3E200, -1000.2E200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of large negative
    // double values.
    public void test_min_with_negative_reversed_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(-1.8E200, -2.3E200, -3.2E200, -400.5E200, -5.9E200, -9.3E200, -1000.2E200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(-1000.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single large
    // negative
    // double.
    public void test_min_with_single_negative_large_double() {
        Vector<Double> listOfDoubles = new Vector<>(Arrays.asList(-3.7E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-3.7E200, actual, 1E190);
    }

    // ---------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector containing both large
    // positive and negative double values.
    public void test_min_with_mixed_unsorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E200, -4.2E200, 5.3E200, 1.5E200, 4.9E200, -8.2E200, 9.1E200, -10.9E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a sorted Vector containing both large
    // positive and negative double values.
    public void test_min_with_mixed_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E200, -4.2E200, 5.3E200, 1.5E200, 4.9E200, -8.2E200, 9.1E200, -10.9E200));
        listOfDoubles.sort(null);
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector containing both
    // large positive and negative double values.
    public void test_min_with_mixed_reversed_sorted_Vector_of_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(3.1E200, -4.2E200, 5.3E200, 1.5E200, 4.9E200, -8.2E200, 9.1E200, -10.9E200));
        listOfDoubles.sort(Collections.reverseOrder());
        double actual = Min.min(listOfDoubles);
        assertEquals(-10.9E200, actual, 1E190);
    }

    // ----------------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value when the smallest number appears multiple
    // times in the Vector of large double values.
    public void test_min_with_duplicate_min_values_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(5.1E200, 2.2E200, 2.2E200, 8.6E200, 2.2E200, 10.9E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(2.2E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value when all elements in the Vector are identical
    // large double values.
    public void test_min_with_all_identical_values_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(Arrays.asList(7.4E200, 7.4E200, 7.4E200, 7.4E200, 7.4E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(7.4E200, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a Vector containing extreme double values
    // (Double.MAX_VALUE, Double.MIN_VALUE, and large doubles).
    public void test_min_with_mixed_extremes_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(Double.MAX_VALUE, Double.MIN_VALUE, 1.5E200, 1.2E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(Double.MIN_VALUE, actual, 1E190);
    }

    @Test
    // Tests finding the minimum value in a Vector that contains zero along with
    // large
    // positive double values.
    public void test_min_with_zero_and_large_doubles() {
        Vector<Double> listOfDoubles = new Vector<>(
                Arrays.asList(0.0, 1.2E200, 1.3E200, 1.5E200, 2.8E200, 2.1E200));
        double actual = Min.min(listOfDoubles);
        assertEquals(0.0, actual, 1E190);
    }

    // ----------------------------------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in an unsorted Vector of string names
    // (lexicographical order).
    public void test_min_with_unsorted_Vector_of_strings() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("carrot", "broccoli", "spinach", "zucchini", "asparagus"));
        String actual = Min.min(listOfstrings);
        assertEquals("asparagus", actual); // Lexicographical order
    }

    @Test
    // Tests finding the minimum value in a sorted Vector of string names.
    public void test_min_with_sorted_Vector_of_strings() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("asparagus", "broccoli", "carrot", "spinach", "zucchini"));
        Collections.sort(listOfstrings);
        String actual = Min.min(listOfstrings);
        assertEquals("asparagus", actual);
    }

    @Test
    // Tests finding the minimum value in a reverse-sorted Vector of string names.
    public void test_min_with_reversed_sorted_Vector_of_strings() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("zucchini", "spinach", "carrot", "broccoli", "asparagus"));
        listOfstrings.sort(Collections.reverseOrder());
        String actual = Min.min(listOfstrings);
        assertEquals("asparagus", actual);
    }

    @Test
    // Tests finding the minimum value in a Vector containing a single string name.
    public void test_min_with_single_string() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("carrot"));
        String actual = Min.min(listOfstrings);
        assertEquals("carrot", actual);
    }

    // ---------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in a Vector containing an empty string and
    // other string names.
    public void test_min_with_empty_strings() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("", "carrot", "broccoli", "spinach"));
        String actual = Min.min(listOfstrings);
        assertEquals("", actual); // Empty string is the smallest
    }

    @Test
    // Tests finding the minimum value in a Vector of single-character strings.
    public void test_min_with_single_character_strings() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("a", "b", "c", "d"));
        String actual = Min.min(listOfstrings);
        assertEquals("a", actual);
    }

    @Test
    // Tests finding the minimum value in a Vector of special characters.
    public void test_min_with_special_characters() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("!", "@", "#", "$"));
        String actual = Min.min(listOfstrings);
        assertEquals("!", actual);
    }

    // ---------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value in a Vector of mixed-case string names
    // (case-sensitive comparison).
    public void test_min_with_mixed_case_strings() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("Carrot", "broccoli", "Spinach", "Zucchini"));
        String actual = Min.min(listOfstrings);
        assertEquals("Carrot", actual); // Lexicographical order is case-sensitive
    }

    @Test
    // Tests finding the minimum value in a Vector of string names with different
    // string lengths.
    public void test_min_with_mixed_length_strings() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("pea", "bean", "lettuce", "pumpkin"));
        String actual = Min.min(listOfstrings);
        assertEquals("bean", actual); // "bean" is lexicographically smaller than "pea"
    }

    @Test
    // Tests finding the minimum value in a Vector of string names containing
    // numbers.
    public void test_min_with_mixed_characters_and_numbers() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("carrot1", "carrot2", "carrot10", "carrot20"));
        String actual = Min.min(listOfstrings);
        assertEquals("carrot1", actual);
    }

    // -----------------------------------------------------------------------------------------------------------

    @Test
    // Tests finding the minimum value when the smallest string name appears
    // multiple times.
    public void test_min_with_duplicate_min_strings() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("carrot", "carrot", "broccoli", "spinach"));
        String actual = Min.min(listOfstrings);
        assertEquals("broccoli", actual); // "broccoli" is smaller than "carrot"
    }

    @Test
    // Tests finding the minimum value when all string names in the Vector are
    // identical.
    public void test_min_with_all_identical_strings() {
        Vector<String> listOfstrings = new Vector<>(Arrays.asList("carrot", "carrot", "carrot", "carrot"));
        String actual = Min.min(listOfstrings);
        assertEquals("carrot", actual);
    }

    @Test
    // Tests finding the minimum value in a Vector containing string names with
    // leading and trailing spaces.
    public void test_min_with_leading_trailing_spaces() {
        Vector<String> listOfstrings = new Vector<>(
                Arrays.asList("  carrot", "broccoli", "spinach  ", "zucchini"));
        String actual = Min.min(listOfstrings);
        assertEquals("  carrot", actual); // Spaces are considered in lexicographical order
    }

    // ----------------------------------------------------------------------------------------------------------------

    // @Test
    // public void minWithEmptyListTest() {
    // List<Integer> emptyList = new Vector<>();
    // assertThrows(IllegalArgumentException.class, () -> Min.min(emptyList));
    // }

    // @Test
    // public void minWithNullListTest() {
    // List<Integer> listWithNulls = Arrays.asList(null, null, null);
    // assertThrows(NullPointerException.class, () -> Min.min(listWithNulls));
    // }

}
