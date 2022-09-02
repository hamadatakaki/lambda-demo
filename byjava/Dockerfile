FROM public.ecr.aws/lambda/java:11

# Copy function code and runtime dependencies from Gradle layout
COPY lib/build/classes/java/main ${LAMBDA_TASK_ROOT}
COPY lib/build/dependency/* ${LAMBDA_TASK_ROOT}/lib/

# Set the CMD to your handler (could also be done as a parameter override outside of the Dockerfile)
CMD [ "byjava.DemoLambda::handleRequest" ]
