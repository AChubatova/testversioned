package Tiger01935

import Tiger01935.buildTypes.*
import Tiger01935.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01935")
    name = "Tiger01935"

    vcsRoot(Tiger01935_cVCSroot)

    buildType(Tiger01935_Hi1)
    buildType(Tiger01935_Hi2)
    buildType(Tiger01935_Hi3)
    buildType(Tiger01935_Hi0)
})
