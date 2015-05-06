module \test::compatibility::TemplateStrings
extend \test::compatibility::Base;

test bool templatestrings() {
	return
	describe("template strings", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var a = \"ba\", b = \"QUX\";
		        'return `foo bar
		        '${a + \"z\"} ${b.toLowerCase()}` === \"foo bar\\nbaz qux\";
		        '})();"
		)),
		\it( "tagged template strings", tryRunning(
				"
		        '(function() {
		        'var called = false;
		        'function fn(parts, a, b) {
		        '  called = true;
		        '  return parts instanceof Array &&
		        '    parts[0]     === \"foo\"      &&
		        '    parts[1]     === \"bar\\n\"    &&
		        '    parts.raw[0] === \"foo\"      &&
		        '    parts.raw[1] === \"bar\\\\n\"   &&
		        '    a === 123                   &&
		        '    b === 456;
		        '}
		        'return fn `foo${123}bar\\n${456}` && called;
		        '})();"
		))
	]);
}