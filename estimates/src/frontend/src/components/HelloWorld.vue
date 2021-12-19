<template>
  <H1>{{ msg }}</H1>
</template>

<script>
export default {
  name: "HelloWorld",
  data() {
    return {
      msg: "",
    };
  },
  mounted() {
    fetch("/api/v1/estimates")
      .then((response) => response.text())
      .then((data) => {
        this.msg = data;
      });
  },
};
</script>