package Tiger01426

import Tiger01426.buildTypes.*
import Tiger01426.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01426")
    name = "Tiger01426"

    vcsRoot(Tiger01426_cVCSroot)

    buildType(Tiger01426_Hi2)
    buildType(Tiger01426_Hi3)
    buildType(Tiger01426_Hi0)
    buildType(Tiger01426_Hi1)
})
